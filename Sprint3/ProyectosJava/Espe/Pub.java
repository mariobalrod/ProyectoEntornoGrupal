package clases;

public class Pub {
    String nombre;
    String direccion;
    double horaApertura;
    double horaCierre;

    public Pub(){}
    public Pub(String nombre, String direccion, double horaApertura, double horaCierre){
         this.nombre= nombre;
         this.direccion= direccion;
         this.horaApertura= horaApertura;
         this.horaCierre= horaCierre;
    }

    public void cerrarPub(double horaCierre){}


}