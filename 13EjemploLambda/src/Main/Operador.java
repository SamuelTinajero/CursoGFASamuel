package Main;

/**
 * Created by sa.tinajero on 16/01/2017.
 */
public class Operador {
    private String nombre;
    private int clave;
    private boolean estatus;

    public Operador(String nombre, int clave, boolean estatus) {
        this.nombre = nombre;
        this.clave = clave;
        this.estatus = estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s | Clave : %d | Estatus : %b",nombre,clave,estatus);
    }
}
