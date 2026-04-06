package org.example.Ejercicio19;

public class Seudocodigo19
{
    /*
    Función controlCorchetes (listaEntrada)
        crear pila vacia //Se crea la pila donde se van a guardar las llaves abiertas
        para cada caracter x en listaEntrada hacer //Se recorre la lista
            si x = "{" entonces //Si encuentra un {, lo guarda en la pila
                apilar (x)
            sino
                si x "}" entonces //Se verifica si es una llave de cierre
                    si pila esta vacia entonces
                        devolver falso // Si aparece un } pero la pila está vacía, es falso
                    sino
                        sacar de la pila
                    fin si
                fin si
            fin si
         fin para

         si pila esta vacia entonces //Si no quedo nada en la pila esta todo perfecto
            devolver verdadero //Y devuelve verdadero
         sino
            devolver falso //Sino devuelve falso, si quedaron { sin cerrar
         fin si
     fin
     */
}

//Por regla de la suma, se cumple que este algoritmo tiene orden lineal
