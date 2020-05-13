package clase;


public class cliente extends Usuario{

    String contraseña;

    public Cliente(){}
    public Cliente(String nombre, String apellido, String contraseña, int edad){
        super(nombre, apellido, contraseña);
        this.edad= edad;
    }

    public String buscarOferta(){}

}