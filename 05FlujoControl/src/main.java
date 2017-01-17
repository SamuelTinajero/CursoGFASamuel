import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String [] nombres = new String[5];
        Scanner scanner = new Scanner(System.in);
        for(int x = 0;x < nombres.length; x++ ){
            System.out.println("Escribe tu nombre negro");
            nombres[x]=scanner.nextLine();
        }
        for(int x = 0; x<nombres.length; x++) System.out.println(nombres[x]);
    }
}