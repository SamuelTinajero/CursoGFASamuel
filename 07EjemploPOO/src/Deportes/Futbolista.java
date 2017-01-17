package Deportes;

import pkg07ejemplopoo.Persona;

public class Futbolista extends Persona implements Deporte{
    private String posicion;
    private int dorsal;
    
    public Futbolista(String nombre, String apellido, int edad,int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    @Override
    public void hablar(){
        System.out.println("ya lo paso pasado... ");
    }

    @Override
    public void jugar() {
        System.out.println("Juega fucho");
    }

    @Override
    public void viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}