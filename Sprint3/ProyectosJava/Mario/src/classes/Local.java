package classes;

import java.util.ArrayList;

public class Local {
    public String nombre;
    public String ubicacion;
    public String telefono;
    public ArrayList<Imagen> imagenes;

    public Local () {}
    public Local (String nombre, String ubicacion, String telefono, ArrayList<Imagen> imagenes) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.imagenes = imagenes;
    } 

    public void colgarImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }
}