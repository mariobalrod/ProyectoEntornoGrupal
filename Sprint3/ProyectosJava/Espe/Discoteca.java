public class Discoteca extends Local{

    double horaApertura;
    double horaCierre;
    String musica;

    public Discoteca(){}
    public Discoteca(String nombre, String direccion, int aforo, double horaApertura, double horaCierre, String musica){
        super(nombre, direccion, aforo);
        this.horaApertura= horaApertura;
        this.horaCierre= horaCierre;
        this.musica= musica;
    }

    public void cambiarMusica(String musica){}
}