package org.example.Ejercicio27;

import org.example.tda.TDACola;
import org.example.tda.TDALista;
import org.w3c.dom.Node;

import java.util.Comparator;
import java.util.function.Predicate;

public class Cola<T> implements TDACola<T> {

    private int agregar=0;
    private int quitar=0;
    private int contador=0;

    private T[] datos ;
    @Override
    public T frente() {
        return null;
    }

    @Override
    public boolean poneEnCola(T dato) {
        if (tamaño() == datos.length) {
            return false;
        }
            datos[agregar]=dato;
            agregar = (agregar + 1) % datos.length;
            contador ++;
            return true;
    }

    @Override
    public T quitaDeCola() {
        if (tamaño() == 0) {
            return null;
        }
        T eliminado = datos[quitar];
        quitar = (quitar + 1) % datos.length;
        contador --;
        return eliminado;
    }

    @Override
    public void agregar(T elem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void agregar(int index, T elem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T obtener(int index) {
        return null;
    }

    @Override
    public T remover(int index) {
        return null;
    }

    @Override
    public boolean remover(T elem) {
        return false;
    }

    @Override
    public boolean contiene(T elem) {
        return false;
    }

    @Override
    public int indiceDe(T elem) {
        return 0;
    }

    @Override
    public T buscar(Predicate<T> criterio) {
        return null;
    }

    @Override
    public TDALista<T> ordenar(Comparator<T> comparator) {
        return null;
    }

    @Override
    public int tamaño() {
        return contador;
    }

    @Override
    public boolean esVacio() {
        return false;
    }

    @Override
    public void vaciar() {
        throw new UnsupportedOperationException();
    }
}
