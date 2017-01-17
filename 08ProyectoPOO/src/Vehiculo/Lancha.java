package Vehiculo;

/**
 * Created by sa.tinajero on 12/01/2017.
 */
public class Lancha extends Vehiculo{
    private String nombre;
    private int capacidad;
    public Lancha(String tipo, int id, boolean audio,String nombre,int capacidad) {
        super(tipo, id, audio);
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void Circular(){
        System.out.println("Estoy circulando en una lancha");
    }

    @Override
    public void Describir(){
        System.out.println("Soy una lancha con capacidad  "+capacidad+" me llamo "+nombre+" y tengo sonido" +isAudio()+" mi id es "+getId());
    }
}
