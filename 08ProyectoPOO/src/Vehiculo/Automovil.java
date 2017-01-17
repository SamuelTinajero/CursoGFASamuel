package Vehiculo;

/**
 * Created by sa.tinajero on 12/01/2017.
 */
public class Automovil extends Vehiculo {
    private String color;
    private String potencia;
    public Automovil(String tipo, int id, boolean audio, String color,String potencia) {
        super(tipo, id, audio);
        this.color = color;
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }


    @Override
    public void Describir(){
        System.out.println("Soy un automovil color "+color+" con potencia "+potencia+" tipo "+getTipo()+" y tengo audio "+isAudio()+" id "+getId());
    }

    @Override
    public void Circular(){
        System.out.println("Estoy circulando en un automovil");
    }
}
