package classes;

import java.util.ArrayList;

public class Empresa extends Usuario {
    ArrayList<Oferta> ofertas;
    ArrayList<Local> locales;

    public Empresa () {}
    public Empresa (String username, String email, Imagen imgPerfil, String password, ArrayList<Oferta> ofertas,  ArrayList<Local> locales) {
        super(username, email, imgPerfil, password);
        this.ofertas = ofertas;
        this.locales = locales;
    }

    public void escribirComentario(String titulo, String cuerpo){
        Comentario comentario = new Comentario(titulo, cuerpo);
        comentario.asignarAutor(this);
        System.out.println("Colgando comentario...");
    }

    public void addLocal(String nombre, String ubicacion, String telefono, ArrayList<Imagen> imagenes){
        Local local = new Local( nombre, ubicacion, telefono, imagenes );
        this.locales.add(local);
    }

    public void colgarOferta(String titulo, String descripcion, ArrayList<Imagen> imagenes){
        Oferta oferta = new Oferta( titulo, descripcion, imagenes );
        this.ofertas.add(oferta);
    }

}