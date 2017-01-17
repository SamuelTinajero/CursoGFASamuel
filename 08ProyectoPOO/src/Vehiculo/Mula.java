package Vehiculo;

public class Mula extends Vehiculo {
    private int edad;
    private String sexo;
    public Mula(String tipo, int id, boolean audio, int edad, String sexo) {
        super(tipo, id, audio);
        this.edad = edad;
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void Describir(){
        System.out.println("Soy una Mula tengo "+edad+" de edad soy "+sexo+" mi id es "+getId()+" tengo audio "+isAudio());
    }

    public void Pastar(){
        System.out.println("Soy una mula que como pasto como vaca");
    }

    public void caminar(){
        System.out.println("Soy una mila de carga");
    }

    @Override
    public void Circular(){
        System.out.println("Estoy circulando en una mula");
    }
}
