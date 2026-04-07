package org.example.Ejercicio23;

public class Main
{
    public static void main(String[] args)
    {
        Empresa empresa1 = new Empresa();
        Prueba.cargarArchivo (empresa1, "suc1.txt");

        System.out.println("Cantidad de sucursales:" + empresa1.cantidadSucursales());
        empresa1.removerSucursal("Chicago"); //Eliminar Chicago de la lista

        Empresa empresa2 = new Empresa();
        Prueba.cargarArchivo (empresa2, "suc2.txt");

    }

}
