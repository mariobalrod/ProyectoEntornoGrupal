package classes;

import java.util.ArrayList;

public class Cliente extends Usuario {
    ArrayList<Usuario> contactos;

    public Cliente () {}
    public Cliente (String username, String email, Imagen imgPerfil, String password, ArrayList<Usuario> contactos) {
        super(username, email, imgPerfil, password);
        this.contactos = contactos;
    }

    public void seguirUsuario(Usuario usuario){
        this.contactos.add(usuario);
    }

    public void escribirComentario(String titulo, String cuerpo){
        Comentario comentario = new Comentario(titulo, cuerpo);
        comentario.asignarAutor(this);
        System.out.println("Colgando comentario...");
    }
}