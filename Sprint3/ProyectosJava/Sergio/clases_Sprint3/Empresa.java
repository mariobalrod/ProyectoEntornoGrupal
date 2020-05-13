package clases_Sprint3;

public class Empresa extends Usuario {
    Evento fiesta;
    String tipoLocal;


    public void publicarFiesta(Evento fiesta){
        System.out.println(fiesta);
    }

    public  void registrarse(){
  
    }

    public boolean login(String nombre, String clave){
        return true;
    }
}