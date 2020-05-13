public class Pub extends Local{
     
     double horaApertura;
     double horaCierre;

     public Pub(){}
     public Pub(String nombre, String direccion, int aforo, double horaApertura, double horaCierre){
          super(nombre, direccion, aforo);
          this.horaApertura= horaApertura;
          this.horaCierre= horaCierre;
     }

     public void cerrarPub(double horaCierre){}


}