package org.example.Ejercicio23;

public class Nodo<T> //Puede guardar cualquier tipo
{
    private T valor; //Variable que guarda el valor
    private Nodo <T> siguiente;
    public Nodo(T valor) //Constructor
    {
        this.valor = valor;
        this.siguiente = null;
    }
    public T getValor() // Método para obtener el valor del nodo
    {
        return valor;
    }
    public void setValor(T valor) // Método para modificar el valor del nodo
    {
        this.valor = valor;
    }
    public Nodo <T> getSiguiente() // Método para obtener el siguiente nodo
    {
        return siguiente;
    }
    public void setSiguiente(Nodo <T> siguiente) //Método para conectar un nodo con otro
    {
        this.siguiente = siguiente;
    }

}
