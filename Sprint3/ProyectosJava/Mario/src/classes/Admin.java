package classes;

import java.util.Scanner;

public class Admin extends Usuario {
    String [] permisos;

    public Admin () {}
    public Admin (String username, String email, Imagen imgPerfil, String password, String [] permisos) {
        super(username, email, imgPerfil, password);
        this.permisos = permisos;
    }

    public void banear(Usuario usuario){
        System.out.println("Usuario baneado");
    }

    public String responerDuda(String pregunta){
        Scanner sc = new Scanner(System.in);
        System.out.println(pregunta);
        System.out.println("Respuesta: ");
        String respuesta = sc.nextLine();
        sc.close();
        return respuesta;
    }

}