package Vehiculo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by sa.tinajero on 12/01/2017.
 */
public class Avion extends Vehiculo {
    private long combustible;
    private String piloto;

    public Avion(String tipo, int id, boolean audio, long combustible , String piloto) {
        super(tipo, id, audio);
        this.combustible = combustible;
        this.piloto = piloto;
    }

    public long getCombustible() {
        return combustible;
    }

    public void setCombustible(long combustible) {
        this.combustible = combustible;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public void volar (){
        System.out.println("estoy volandooooooooooo");
    }

    public void SOS(){
        System.out.println("Esto se descontrolo AYUDAAAAAAAAAAAA !!!");
    }


    @Override
    public void Describir(){
        System.out.println("Esto es un avion es de tipo : "+getTipo()+" su id es: "+getId()+" tiene audio"+isAudio()+" tiene "
                +getCombustible()+" de combustible"+" y el piloto es "+getPiloto() );
    }

    @Override
    public void Circular(){
        System.out.println("Estoy circulando en un Avion ");
    }
}
