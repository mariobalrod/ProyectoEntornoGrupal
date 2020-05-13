
public class Empresa extends Usuario{
    String nombreEmpresa;
    String direccion;
    
    public Empresa(){}
    public Empresa(String nombre, String apellidos, String contraseña, String nombreEmpresa, String direccion){
        super(nombre, apellidos, contraseña);
        this.nombreEmpresa= nombreEmpresa;
        this.direccion= direccion;
        
    }

    public String publicarOfertas(){}
}