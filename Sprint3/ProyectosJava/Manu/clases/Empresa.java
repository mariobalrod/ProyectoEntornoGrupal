package Sprint3.clases;

public class Empresa extends Usuario{
    String nombreEmpresa;
    String direccion;
    
    public Empresa(){}
    public Empresa(String nombre, String contraseña, String nombreEmpresa, String direccion){
        super(nombre, contraseña);
        this.nombreEmpresa= nombreEmpresa;
        this.direccion= direccion;
        
    }

    public String publicarFiesta(){}
}