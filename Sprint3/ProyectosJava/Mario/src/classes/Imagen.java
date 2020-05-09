package classes;

import interfaces.ValidarImagen;

public class Imagen implements ValidarImagen {
    String uri;
    int tamanio;

    public Imagen () {}
    public Imagen ( String uri, int tamanio ) {
        this.uri = uri;
        this.tamanio = tamanio;
    }
    
    public void subirImagen(Imagen imagen){
        System.out.println("Subiendo Imagen ...");
    }

    public boolean validarImagen(Imagen imagen){
        if(tamanio>500){
            return false;
        }else{
            return true;
        }
    }
}