package clases;

public class Cliente extends Usuario{
    int edad;

    public Cliente(){}
    public Cliente(String nombre, String contraseña, int edad){
        super(nombre, contraseña);
        this.edad= edad;
    }

    public void buscarOferta() {
    }

}
