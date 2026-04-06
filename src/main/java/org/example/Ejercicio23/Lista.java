package org.example.Ejercicio23;

import org.example.tda.TDALista;
import java.util.Comparator;
import java.util.function.Predicate;

public class Lista<T> implements TDALista<T>
{
    private Nodo<T> primeroEnLista;

    public Lista()
    {
        this.primeroEnLista = null;
    }
    @Override
    public void agregar(T valor) // Agrega un elemento al final de la lista
    {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (primeroEnLista == null)
        {
            primeroEnLista = nuevo;
        }
        else
        {
            Nodo<T> actual = primeroEnLista;
            while (actual.getSiguiente() != null)
            {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    @Override
    public void agregar(int index, T elem)
    {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean remover(T valor) // Saca un elemento y devuelve true si lo sacó
    {
        if  (primeroEnLista == null)
        {
            return false;
        }
        if (primeroEnLista.getValor().equals(valor))
        {
         primeroEnLista = primeroEnLista.getSiguiente();
         return true;
        }
       Nodo<T> actual = primeroEnLista;
        while (actual.getSiguiente() != null)
        {
            if (actual.getSiguiente().getValor().equals(valor))
            {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public boolean contiene (T valor) // Busca un elemento, si existe devuelve true
    {
        Nodo<T> actual = primeroEnLista;
        while (actual != null) {
            if (actual.getValor().equals(valor))
            {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public boolean buscar (T valor)
    {
        return  contiene(valor);
    }

    public int tamaño() // Devuelve la cantidad de elementos
    {
        int contador = 0;
        Nodo<T> actual = primeroEnLista;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    public boolean esVacio() // Verifica si la lista esta vacía
    {
        return primeroEnLista == null;
    }

    @Override
    public void vaciar()
    {
        primeroEnLista = null;
    }

    public void armarEnLista() // Lista todos los elementos, uno arriba del otro
    {
        Nodo<T> actual = primeroEnLista;
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getSiguiente();
        }
    }

    @Override
    public int indiceDe(T elem) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public T buscar(Predicate<T> criterio) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public TDALista<T> ordenar(Comparator<T> comparator)
    {
        throw  new UnsupportedOperationException();
    }

    @Override
    public T obtener(int index)
    {
        throw  new UnsupportedOperationException();
    }

    @Override
    public T remover(int index)
    {
        throw  new UnsupportedOperationException();
    }

}
