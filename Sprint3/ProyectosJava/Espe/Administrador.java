package clases;

public class Administrador extends Usuario{
    String permisos;

    public Administrador(){}
    public Administrador(String nombre, String contraseña, String permisos){
        super(nombre, contraseña);
        this.permisos= permisos;
    }
    
    public void concederPermisos(String permisos){}

}

