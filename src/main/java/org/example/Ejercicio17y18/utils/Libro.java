package org.example.Ejercicio17y18.utils;

public class Libro implements Comparable<Libro>{

    private String isbn;
    private String titulo;
    private String autor;
    private double precio;
    private int stock;

    public Libro(String isbn, String titulo, String autor, double precio, int stock) { // constrcutor
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    public String getIsbn() {
        return isbn; // obtenemos el isbn
    }

    public String getTitulo() {
        return titulo; // obtenemos el titulo del libro
    }

    public String getAutor() {
        return autor; // obtenemos el autor
    }

    public double getPrecio() {
        return precio; // obtenemos el precio
    }

    public int getStock() {
        return stock; // obtenemos el stock
    }

    public void agregarStock (int cantidad){

        stock += cantidad; // sumamos al stock la cantidad que pongmaos
    }

    public void quitarStock(int cantidad)
    {
        if (cantidad < this.stock)
        {
            this.stock = 0;
        }
        else {
            this.stock -= cantidad;
        }
    }

    public boolean modificarStock (int cantidad){
        if (this.stock + cantidad <0){ // si el stock + la cantidad es menor a 0
            return false; // retorna falso
        }
        else {
            this.stock += cantidad; // sino agrega la cantidad al stock y lo modifica
        }
        return true; // devuelve true
    }

    @Override
    public int compareTo(Libro libro) { // compara un libro con otro para ordenarlos alfabeticamente y tenernos ordenados en una lista basandose en el autor
        return this.autor.compareTo(libro.getAutor());
    }

    @Override
    public String toString() {
        return (isbn + "," + titulo + "," + autor + "," + precio + "," + stock); // retorna String con los atributos algunos modificiados si es que se implementa algunos metodos
    }


}
