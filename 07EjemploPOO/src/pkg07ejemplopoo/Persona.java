package pkg07ejemplopoo;

public class Persona {
    private String nombre,apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombreCompleto) {
        String [] nC = nombreCompleto.split(" ");
        this.nombre = nC[0];
        this.nombre = nC[1];
        this.edad = 0;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void hablar(){
        System.out.println("saludos soy el arquero vengo en paz" + nombre);
    }
    
    public void comer(){
        System.out.println("Estoy comiendo un PAN !");
    }
    
    
}
