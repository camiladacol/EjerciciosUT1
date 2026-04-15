package org.example.Ejercicio17y18.utils;

import java.util.Objects;

public class Biblioteca {

    private ListaEnlazada<Libro> libros;  // Lista de libros de la biblioteca

    private double acumuladorAdquisiciones = 0; // atributo para usar en la clase de adquisiciones

    private int prestamos = 0; // atributo para usar en la clase de pestamos

    private int devoluciones = 0; // atributo para usar en la clase de devoluciones
    // Constructor
    public Biblioteca() {

        this.libros = new ListaEnlazada<>();
    }

    // Ver el catologo de libros disponibles en la biblioteca
    public ListaEnlazada<Libro> verLibrosDisponibles() {
        return libros;
    }

    // Agregar libro nuevo
    public void agregarLibro(Libro libro) {
        libros.agregar(libro);
    }

    // Agregar al stock libro ya existente
    public void agergarLibroExistente(Libro libro) {
        Libro libroExistente = buscarPorIsbn(libro.getIsbn());
        if (libroExistente != null) {
            libroExistente.agregarStock(libro.getStock());
        } else {
            agregarLibro(libro);
        }
    }

    // Buscar libro por el isbn
    public Libro buscarPorIsbn(String isbn) {

        return libros.buscar(libro -> Objects.equals(libro.getIsbn(), isbn));
    }


    // Eliminar libro del catalogo
    public Libro retirarLibroDelCatalogo (String isbn)
    {
        Libro libro = buscarPorIsbn(isbn);
        if (libro != null) {
            return libros.remover(libro);
        } else {
            return null;
        }
    }

    // Ordernar libros
    public void ordenarLibros() {
        // Creamos un comparador que use el título del libro
        libros.ordenar((libro1, libro2) -> libro1.getTitulo().compareToIgnoreCase(libro2.getTitulo()));
    }

    public double adquisiciones(String archivo) {
        this.acumuladorAdquisiciones = 0; // contador en 0

        FileUtils.leerLineas(archivo, linea -> { // leemos archivo linea por linea
            String[] partes = linea.split(","); // delimitador que usamos para separar
            String isbn = partes[0].trim();
            String titulo = partes[1].trim();
            String autor = partes[2].trim();
            double precio = Double.parseDouble(partes[3].trim());
            int cantidad = Integer.parseInt(partes[4].trim());

            Libro libroExistente = buscarPorIsbn(isbn); // buscamos si el libro ya existe por el isbn

            if (libroExistente != null) { // si el libro ya exioste, lo sumamos a la cantidad
                libroExistente.agregarStock(cantidad);
            } else {
                Libro nuevoLibro = new Libro(isbn, titulo, autor, precio, cantidad); // si es nuevo lo creamos y lo añadimos
                agregarLibro(nuevoLibro);
            }
            this.acumuladorAdquisiciones += (precio * cantidad); //sumamos el costo de la adquisicion  al contador
        });

        return this.acumuladorAdquisiciones; // devuelve el gasto total que se va realizando
    }

    public int prestamos(String archivo) {

        this.prestamos = 0; // contador en 0

        FileUtils.leerLineas(archivo, linea -> { // leemos linea por linea
            String[] partes = linea.split(",");
            String isbn = partes[0].trim();
            String tipo = partes[1].trim(); // "PRESTAMO" o "DEVOLUCION"
            int cantidad = Integer.parseInt(partes[2].trim());

            Libro libro = buscarPorIsbn(isbn); // buscamos si el libro ya existe por el isbn

            if (libro != null) {
                if (tipo.equalsIgnoreCase("PRESTAMO")) { // si es un prestamo
                    int cantidadDeLibrosDisponibles = Math.min(cantidad, libro.getStock()); // prestamos lo que pide siempre y cuanto tengamos esa cantidad o mas en stocxk, sino se presta lo que se tiene
                    libro.quitarStock(cantidadDeLibrosDisponibles); // sacamos de la cantidad el stock que prestamos
                    this.prestamos += cantidadDeLibrosDisponibles; // añadimos la cnatidad de libros que prestamos al contador

                } else if (tipo.equalsIgnoreCase("DEVOLUCION")) {
                    libro.agregarStock(cantidad); // agregamos la cantidad que se devolvio al stock
                    this.prestamos -= cantidad; // restamos esa cantidad al contador
                }
            }
        });
        return this.prestamos; // retornamos los prestamos
    }
}

