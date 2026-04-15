package org.example.Ejercicio17y18.utils;

public class Nodo<T> {

    private T dato;
    private Nodo<T> siguiente; // autoreferencia. puntero que apunta al proximo nodo de la lista

    public Nodo(T dato) { // constructor
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() { //
        return dato; //obtener el atributo dato
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente; // obtenemos la referencia del siguiente nodo. esto nos sirve para podr recorrer la lista
    }

    public void setSiguiente(Nodo<T> siguiente) { // la funciones de este stter es conectar un nodo con otro
        this.siguiente = siguiente;  //
    }

    public Comparable getEtiqueta() { // metodo para obenter un valor que nos sirva apra comparar o identificar el nodo
        if (dato instanceof Libro) { // pregunta si el datos que esoty guardadno es del tipo Libro
            return ((Libro) dato).getIsbn(); // si es un libro lo trata como uno y nos devuelve el isbn
        }
        return null; // si el dato no es un libro nos da nulo
    }
}
