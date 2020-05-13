package Sprint3.clases;

public class Admin extends Usuario{
    
    String permiso;
    
    public Admin(){}
    public Admin(String nombre, String contraseña, String permisos){
        super(nombre,contraseña);
        this.permiso= permisos;
    }    
    public void Permisos(String permiso){}
    }
}