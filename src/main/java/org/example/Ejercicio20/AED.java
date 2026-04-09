package org.example.Ejercicio20;
import java.util.LinkedList;
import java.util.List;

public class AED {

    private LinkedList<Sucursal> ciudades = new LinkedList<Sucursal>();
    private String ruta = "src/main/Resources/sucursales.txt";

    public void agregarUnaSucursal(String nombre) {
        Sucursal nuevaSucursal = new Sucursal(nombre);
        ciudades.add(nuevaSucursal);
    }

    public boolean buscarSucursal(Sucursal sucursal){
        for (Sucursal busqueda : ciudades) {
            if (busqueda.equals(sucursal)){
                return true;
            }
        }
        return false;
    }

    public void quitarSucursal(Sucursal sucursal) {
        ciudades.remove(sucursal);
    }

    public int cantidadSucursales(){

        int cantidadCiudades = ciudades.size();
        return cantidadCiudades;
    }

    public List<String> listarSucursales()
    {
        List<String> listaSucursales = new LinkedList<>();
        for (Sucursal sucursal : ciudades) {
            listaSucursales.add(sucursal.getNombre());
        }
        return listaSucursales;
    }

    public boolean directorioVacio(){
        return ciudades.isEmpty();
    }
}
