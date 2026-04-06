package org.example.Ejercicio26;
import java.util.List;
import java.util.Stack;

public class Expresion
{
    public boolean controlCorchetes(List<Character> listaDeEntrada)
    {
        Stack<Character> pila = new Stack<>(); //Crea la pila donde se van a guardar las llaves abiertas
        for (int i = 0; i < listaDeEntrada.size(); i++)
        {
            char x = listaDeEntrada.get(i);
            if (x == '{')
            {
                pila.push(x); // Si encuentra una { la apila
            }
            else if (x == '}') //Si encuentra un }
            {
                if (pila.isEmpty()) //Si la pila esta vacia devuelve falso
                {
                    return false;
                }
                else
                {
                    pila.pop(); //Sino hace pop (saca el último elemento que se agrego a la pila) y saca una llave abierta
                }
            }
        }
        return pila.isEmpty(); //Si la pila quedó vacia devuelve true, sino false
    }
}
