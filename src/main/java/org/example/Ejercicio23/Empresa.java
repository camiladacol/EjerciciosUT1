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

    public boolean removerSucursal(String sucursal)
    {
        return sucursales.remover(sucursal);
    }

    public boolean buscarSucursal(String sucursal)
    {
        return sucursales.buscar(sucursal);
    }

    public boolean vacio()
    {
        return sucursales.esVacio();
    }

    public void listaSucursales()
    {
        sucursales.armarEnLista();
    }

    public int cantidadSucursales()
    {
        return sucursales.tamaño();
    }
}
