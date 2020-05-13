package clases_Sprint3;

/**
 * Regulador
 */
public class Regulador extends Usuario{

    String claveRegulador;
    Permisos permisos;
    String informacionContacto;


    public void banear() {
        
    }

    public String publicarNormasForo() {
        return "respeto";
    }

    public  void registrarse(){
  
    }

    public boolean login(String nombre, String clave){
        return true;
    }
}