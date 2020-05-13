public class Caracteristicas extends Local{

    boolean servicioComida;

    public Caracteristicas(){}
    public Caracteristicas(String nombre, String direccion, int aforo, boolean servicioComida) {
        super(nombre, direccion, aforo);
        this.servicioComida= servicioComida;
    }

    public void catalogarLocal(boolean servicioComida){}

}
