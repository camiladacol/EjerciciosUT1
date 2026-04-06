Análisis de complejidad
-

El tiempo del algoritmo depende la cantidad de caracteres en la lista. Recorre una vez sola de principio a fin para cada caracter en la lista.

Esto quiere decir que si la lista tiene N elementos, entonces hace N pasos.

El espacio tambien depende de la cantidad de elementos, una vez que se complete el par {}, la pila se va a ir vaciando.

El peor caso posible es que nunca entre una llave de cierre y solo queden de abierto, por lo que guardaría todos los { en la pila.

En el caso de ir completando pares de llaves la memoria será poca, si son siempre abiertos se ocupará más.

(agregar pre y post condiciones)

revisar explicacion, ver ordenes