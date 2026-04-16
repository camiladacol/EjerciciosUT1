package org.example.Ejercicio23;

public class Main
{
    public static void main(String[] args)
    {
        Empresa empresa1 = new Empresa();
        Prueba.cargarArchivo (empresa1, "suc1.txt");

        System.out.println("Cantidad de sucursales:" + empresa1.cantidadSucursales());

        System.out.println("Sucursales cargadas");
        empresa1.listaSucursales();

        empresa1.removerSucursal("Chicago"); //Eliminar Chicago de la lista
        empresa1.listaSucursales();

        Empresa empresa2 = new Empresa();
        Prueba.cargarArchivo (empresa2, "suc2.txt");

        empresa2.removerSucursal("Tokio");
        empresa2.listaSucursales();

        Empresa empresa3 = new Empresa();
        Prueba.cargarArchivo (empresa3, "suc3.txt");

    }

}
