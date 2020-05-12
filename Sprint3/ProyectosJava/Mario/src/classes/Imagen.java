package classes;

public class Imagen {
    public String uri;
    public int tamanio;

    public Imagen () {}
    public Imagen ( String uri, int tamanio ) {
        this.uri = uri;
        this.tamanio = tamanio;
    }
    
    public void subirImagen(Imagen imagen){
        System.out.println("Subiendo Imagen ...");
    }

}