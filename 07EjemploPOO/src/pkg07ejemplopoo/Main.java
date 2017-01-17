package pkg07ejemplopoo;

import Deportes.Futbolista;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Samuel Tinajero");
        p.hablar();
        Futbolista f = new Futbolista("samuel", "Tinajero", 20, 20, "Delantero");
        f.hablar();
    }
}
