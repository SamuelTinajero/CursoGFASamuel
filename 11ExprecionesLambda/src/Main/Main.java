package Main;

/**
 * Created by sa.tinajero on 14/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        matematicas suma  = (float a, float b) -> a+b;
        matematicas resta  = (float a, float b) -> a-b;
        matematicas multiplicacion  = (float a, float b) -> a*b;
        matematicas division  = (float a, float b) -> a/b;

        System.out.println("Suma de 10 + 20 "+suma.Operacion(1,1));
        System.out.println("Resta de 10 - 20 "+operar(10f,20f,resta));
        System.out.println("Multiplicacion de 10 - 20 "+operar(10f,20f,multiplicacion));
        System.out.println("Division de 10 - 20 "+operar(10f,20f,division));

    }

    static float operar (float a, float b, matematicas operacion){
        return operacion.Operacion(a,b);
    }
}
