package classes;

public class Usuario {
    public String username;
    public String email;
    public Imagen imgPerfil;
    public String password;

    public Usuario () {}
    public Usuario (String username, String email, Imagen imgPerfil, String password) {
        this.username = username;
        this.email = email;
        this.imgPerfil = imgPerfil;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String validarLogin (String contrasenia) {
        String token = "owefngoweufbnou3oubweou"; //Seria uno aleatorio
        if(contrasenia.equalsIgnoreCase(password)){
            return token;
        }else {
            return "Contrasenia Incorrecta";
        }
    }
    
    public boolean validarRegistro (Usuario usuario) {
        /*  
            Esta variable boolean valido se conseguiria al consultar 
            en una base de datos con los usuarios ya creados para ver
            si las credenciales ingresadas para el registro no estan en 
            uso. Ademas la contraseña pararia por un validador.
        */
        boolean valido = true;
        if(valido){
            System.out.println("Creando Usuario...");
            System.out.println("Guardando Base de Datos...");
            System.out.println("Usuario creado con exito");
            return true;
        }else {
            System.out.println("Credenciales incorrectas");
            return false;
        }
    }
}