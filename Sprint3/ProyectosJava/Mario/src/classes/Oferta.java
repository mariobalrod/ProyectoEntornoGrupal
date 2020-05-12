package classes;

import java.util.ArrayList;

public class Oferta {
    public String titulo;
    public String descripcion;
    public ArrayList<Imagen> imagenes;

    public Oferta () {}
    public Oferta (String titulo, String descripcion, ArrayList<Imagen> imagenes){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenes = imagenes;
    } 

    public void colgarImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }
}