package org.example.Ejercicio23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prueba
{
    static void cargarArchivo(Empresa empresa1, String nombreArchivo) //Método que recibe una empresa y nombre del archivo
    {
        try
        {
            Scanner s = new Scanner(new File(nombreArchivo)); //Se crea un scanner para leer el archivo
            while (s.hasNextLine())
            {
                String linea = s.nextLine(); //Lee una linea del archivo
                empresa1.agregarSucursal(linea); //Agrega la ciudad a la empresa
            }
            s.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("No se encontro el archivo");
        }
    }
}
