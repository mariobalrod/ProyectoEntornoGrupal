package classes;

public class Comentario {
    public Usuario usuario;
    public String titulo;
    public String cuerpo;

    public Comentario () {}
    public Comentario (String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public void asignarAutor (Usuario usuario) {
        this.usuario = usuario;
    }
}