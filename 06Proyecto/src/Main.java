import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones op = new Operaciones();
        System.out.println("Por favor defina el tamaño");
        int [] arreglo = new int[scanner.nextInt()];
        for (int x = 0; x <  arreglo.length; x++ ){
            System.out.println("valor del arreglo "+x);
            arreglo[x] = scanner.nextInt();
        }
        System.out.println("1 para suma \n 2 para media \n 3 para numero mayor");
        System.out.println(op.generico(arreglo,scanner.nextInt()));
    }
}
