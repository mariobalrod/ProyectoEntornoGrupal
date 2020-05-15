package classes;

import java.util.ArrayList;

public class Oferta {
    public String titulo;
    public String descripcion;
    public ArrayList<Imagen> imagenes;
    public Empresa empresa;

    public Oferta () {}
    public Oferta (String titulo, String descripcion, ArrayList<Imagen> imagenes, Empresa empresa){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenes = imagenes;
        this.empresa = empresa;
    } 

    public void colgarImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }
}