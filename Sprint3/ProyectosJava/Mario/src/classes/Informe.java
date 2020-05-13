package classes;

public class Informe {
  public String titulo;
  public String motivo;
  public Usuario usuario;
  
  public Informe () {}
  public Informe (String titulo, String motivo, Usuario usuario) {
    this.titulo = titulo;
    this.motivo = motivo;
    this.usuario = usuario;
  }
}
