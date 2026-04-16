Análisis de complejidad
-

El tiempo del algoritmo depende la cantidad de caracteres en la lista. Recorre una vez sola de principio a fin para cada caracter en la lista.

Esto quiere decir que si la lista tiene N elementos, entonces hace N pasos.

El espacio tambien depende de la cantidad de elementos, una vez que se complete el par {}, la pila se va a ir vaciando.

El peor caso posible es que nunca entre una llave de cierre y solo queden de abierto, por lo que guardaría todos los { en la pila.

En el caso de ir completando pares de llaves la memoria será poca, si son siempre abiertos se ocupará más.

**Precondiciones:**
* La pila tiene que estar vacía 
* La lista puede contener { y }

**Postcondiciones:**
* La función devuelve VERDADERO si la secuencia de llaves está bien formada
* La lista de entrada no se modifica
* La función devuelve FALSO si la secuencia de llaves no está bien formada
* Si la expresión esta bien formada, la pila vuelve a quedar vacía

Lenguaje natural
-
Se parte de una pila vacía y se recorre la lista de caracteres de entrada
Cada vez que aparece una llave que abre {, se agrega en la pila
Cada vez que aparece una llave de cierre }, se intenta sacar un elemento de la pila
Al finalizar el recorrido, si la pila quedó vacía, la secuencia es correcta,en caso contrario, faltan cierres y la secuencia es incorrecta.