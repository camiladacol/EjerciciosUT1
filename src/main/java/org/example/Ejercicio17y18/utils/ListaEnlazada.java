package org.example.Ejercicio17y18.utils;
import java.util.Comparator;
import java.util.function.Predicate;

public class ListaEnlazada<T> {
    protected Nodo<T> primero;

    public void agregar(T elem) {
        if (primero == null) {
            primero = new Nodo<>(elem);
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(new Nodo<>(elem));
        }
    }

    public T buscar(Predicate<T> criterio) {
        Nodo<T> actual = this.primero;
        while (actual != null && criterio.test(actual.getDato()) == false) {
            actual = actual.getSiguiente();
        }
        if (actual == null) {
            return null;
        }
        return actual.getDato();
    }

    public void agregar(int index, T elem) {
        Nodo<T> nuevoNodo = new Nodo<>(elem);
        if (index == 0) { // Si el indice es igual a 0
            nuevoNodo.setSiguiente(primero); // Asignamos el siguiente del nuevo nodo al nodo que actualmente es el primero
            primero = nuevoNodo; // Ahora primero es el nuevo nodo
        } else {
            Nodo<T> actual = primero; // referenciamos para no perder la referencia del nodo
            for (int i = 1; i < index - 1; i++) { // recorremos la lista
                actual = actual.getSiguiente();
            } // actual pasa

            if (actual != null) { // si actual no es nulo
                nuevoNodo.setSiguiente(actual.getSiguiente()); // el siguiente del nuevoNodo apunta al siguiente del nodo actual
                actual.setSiguiente(nuevoNodo); // actual ahora apunta al nuevoNodo
            }
        }
    }

    public T remover(T elem) {
        Nodo<T> actual = this.primero;
        if (primero == null || elem == null) {
            return null;
        }
        if (primero.getDato().equals(elem)) {
            T datoAEliminar = primero.getDato();
            primero = primero.getSiguiente();
            return datoAEliminar;

        }
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(elem)) {
            actual = actual.getSiguiente();

        }

        if (actual.getSiguiente() != null) {
            T datoAEliminar = actual.getSiguiente().getDato();
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return datoAEliminar;
        }
        return null;
    }

    public void ordenar(Comparator<T> comparator) {
        if (primero == null) return;

        boolean bandera;
        do {
            bandera = false;
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                if (comparator.compare(actual.getDato(), actual.getSiguiente().getDato()) > 0) {
                    T datoTemporal = actual.getDato();
                    actual.setDato(actual.getSiguiente().getDato());
                    actual.getSiguiente().setDato(datoTemporal);
                    bandera = true;
                }
                actual = actual.getSiguiente();
            }
        } while (bandera);
    }
}
