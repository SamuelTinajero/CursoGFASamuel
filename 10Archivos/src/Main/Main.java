package Main;

import java.util.Scanner;

/**
 * Created by sa.tinajero on 13/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        /*System.out.println("Ingresa el codigo de error");
        int cError = scanner.nextInt();
        System.out.println("Ingresa la descripcion del error");
        String descripcion = scanner2.nextLine();

        Error error = new Error(cError,descripcion);
        error.escribir("out/production/10Archivos/Main/errores.txt"); */

        IEscribible e = new Error();
        e.leer("out/production/10Archivos/Main/errores.txt",1484411363524L);
        System.out.println(e);


    }
}
