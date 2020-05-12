package classes;

public class Comentario {
    public String titulo;
    public String cuerpo;
    public String autor;

    public Comentario () {}
    public Comentario (String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public void asignarAutor (Usuario usuario) {
        this.autor = usuario.getUsername();
    }
}