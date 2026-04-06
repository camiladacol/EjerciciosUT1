package org.example.Ejercicio23;

public class Empresa
{
    private Lista <String> sucursales;

    public Empresa()
    {
        this.sucursales = new Lista<>();
    }
    public void agregarSucursal(String sucursal)
    {
        sucursales.agregar(sucursal);
    }

    public boolean sacarSucursal(String sucursal)
    {
        return sucursales.sacar(sucursal);
    }

    public boolean buscarSucursal(String sucursal)
    {
        return sucursales.buscar(sucursal);
    }

    public int cantidadSucursales(String sucursal)
    {
        return sucursales.cantidad();
    }

    public boolean vacio()
    {
        return sucursales.esVacio();
    }

    public void listaSucursales()
    {
        sucursales.armarEnLista();
    }

}
