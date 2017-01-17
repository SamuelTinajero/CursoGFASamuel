package Vehiculo;

/**
 * Created by sa.tinajero on 12/01/2017.
 */
public class Vehiculo {

    private String Tipo;
    private int id;
    private boolean Audio;

    public Vehiculo(String tipo, int id, boolean audio) {
        Tipo = tipo;
        this.id = id;
        Audio = audio;
    }

    public Vehiculo(int id) {
        this.id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAudio() {
        return Audio;
    }

    public void setAudio(boolean audio) {
        this.Audio = audio;
    }

    public void Circular(){
        System.out.println("Estoy circulando");
    }

    public void Recargar(){
        System.out.println("Estoy recargando ");
    }

    public void Describir(){
        System.out.println("Soy un "+getTipo()+" mi ID es: "+ getId()+" y tengo audio: "+isAudio());
    }
}
