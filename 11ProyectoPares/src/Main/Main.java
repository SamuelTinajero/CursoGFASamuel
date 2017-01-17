package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matematicas verificador  = (int a) -> a%2==0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Define el tamaño del arreglo inicial");
        int tamaño = scanner.nextInt();
        int [] datos = new int[tamaño];
        int [] pares = new int[tamaño];
        int [] nones  = new int[tamaño];

        for(int i = 0; i< tamaño ; i++){
            System.out.println("Ingresa el valor del arreglo "+1);
            datos[i] = scanner.nextInt();
            if (verificador.Operacion(datos[i])){
                pares[i]= datos[i];
            }else{
                nones[i]= datos[i];
            }
        }

        System.out.println("PARES");
        for (int x =0 ; x<pares.length; x++){
            System.out.println(pares[x]);
        }
        System.out.println("NONES");
        for (int x =0 ; x<pares.length; x++){
            System.out.println(nones[x]);
        }
    }
}