package org.example;

import org.example.Ejercicio17.aed.utils.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        double librosNuevos = biblioteca.adquisiciones("adquisiciones.txt");
        System.out.println("Inversión total: $" + librosNuevos);
        int prestamosYDevoluciones = biblioteca.prestamos("prestamos.txt");
        System.out.println("Ejemplares prestados: " + prestamosYDevoluciones);
        biblioteca.ordenarLibros();

    }
}