/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deportes;

import pkg07ejemplopoo.Persona;

/**
 *
 * @author sa.tinajero
 */
public class Boxeador extends Persona implements Deporte{
    private String peso;
    
    public Boxeador(String nombre, String apellido, int edad, String peso) {
        super(nombre, apellido, edad);
        this.peso = peso;
    }

    @Override
    public void jugar() {
        System.out.println("Golpe");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando");
    }
    
    
    @Override
    public void entrenar() {
        System.out.println("El gym papu");
    }
    
    
}
