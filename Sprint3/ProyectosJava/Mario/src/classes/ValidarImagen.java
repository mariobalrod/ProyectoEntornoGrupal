package classes;

public class ValidarImagen {
    public boolean validacion;

    public ValidarImagen () {}
    public ValidarImagen (boolean validacion) {
        this.validacion = validacion;
    }

    public void validarImagen(Imagen imagen){
        if(imagen.tamanio>500){
            this.validacion = true;
        }else{
            this.validacion = false;
        }
    }
}