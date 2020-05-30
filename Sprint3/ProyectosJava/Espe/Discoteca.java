package clases;

public class Discoteca {
   
    String nombre;
    String direccion;
    String musica;

    public Discoteca(){}
    public Discoteca(String nombre, String direccion, int aforo, double horaApertura, double horaCierre, String musica){
        this.nombre=nombre;
        this.direccion=direccion;
        this.musica= musica;
    }

    public void cambiarMusica(String musica){}
}