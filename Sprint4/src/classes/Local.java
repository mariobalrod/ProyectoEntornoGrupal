package classes;

import java.util.ArrayList;

public class Local {
    public String nombre;
    public String ubicacion;
    public String telefono;
    public ArrayList<Imagen> imagenes;
    public Empresa empresa;

    public Local () {}
    public Local (String nombre, String ubicacion, String telefono, ArrayList<Imagen> imagenes, Empresa empresa) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.imagenes = imagenes;
        this.empresa = empresa;
    } 

    public void colgarImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }
}