package clases;


public class Administrador extends Usuario{
    String permisos;

    public Administrador(){}
    public Administrador(String nombre, String apellido, String contraseña, String permisos){
        super(nombre, apellido,contraseña);
        this.permisos= permisos;
    }
    
    public void concederPermisos(String permisos){}

}