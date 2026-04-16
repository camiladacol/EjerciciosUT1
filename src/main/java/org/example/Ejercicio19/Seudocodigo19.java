package org.example.Ejercicio19;

public class Seudocodigo19
{
    /*
    Función controlCorchetes (listaEntrada)
O(1)        crear pila vacia //Se crea la pila donde se van a guardar las llaves abiertas
O(n)          para cada caracter x en listaEntrada hacer //Se recorre la lista
O(1)              si x = "{" entonces //Si encuentra un {, lo guarda en la pila
O(1)                  apilar (x)
                 sino
O(1)                  si x = "}" entonces //Se verifica si es una llave de cierre
O(1)                      si pila esta vacia entonces
O(1)                          devolver falso // Si aparece un } pero la pila está vacía, es falso
                    sino
O(1)                          sacar de la pila
                    fin si
                fin si
            fin si
         fin para

O(1)           si pila esta vacia entonces //Si no quedo nada en la pila esta todo perfecto
O(1)              devolver verdadero //Y devuelve verdadero
         sino
O(1)              devolver falso //Sino devuelve falso, si quedaron { sin cerrar
         fin si
     fin
     */
}

//Por regla de la suma, se cumple que este algoritmo tiene orden lineal
