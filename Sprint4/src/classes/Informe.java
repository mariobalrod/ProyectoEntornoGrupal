package classes;

public class Informe {
  public String titulo;
  public String motivo;
  public Usuario usuario;
  public Admin admin;
  
  public Informe () {}
  public Informe (String titulo, String motivo, Usuario usuario, Admin admin) {
    this.titulo = titulo;
    this.motivo = motivo;
    this.usuario = usuario;
    this.admin = admin;
  }
}
