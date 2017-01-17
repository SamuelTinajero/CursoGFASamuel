import matematicas.Matematicas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Matematicas mat = new Matematicas();
        Scanner lector = new Scanner(System.in);
        float a,b;

        System.out.println("Dame tu numero negro");
        a = lector.nextFloat();
        System.out.println("Dame tu numero negro");
        b = lector.nextFloat();

        System.out.println("El resultado es : "+mat.suma(a,b));
        System.out.println("El resultado es : "+mat.resta(a,b));
        System.out.println("El resultado es : "+mat.multiplicacion(a,b));
        System.out.println("El resultado es : "+mat.divicion(a,b));
    }
}
