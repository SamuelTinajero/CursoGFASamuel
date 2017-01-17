package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sa.tinajero on 16/01/2017.
 */
public class Main {
    static List <Operador> lista  =Arrays.asList(
        new Operador("Mario",123,true),
        new Operador("Jose",456,false),
        new Operador("Abel",616,true),
        new Operador("Armando",555,true),
        new Operador("Juan",666,false)
        );
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        filtroAntiguo();
        System.out.println(System.currentTimeMillis());
        filtroNuevo();
        System.out.println(System.currentTimeMillis());
    }

    static void filtroAntiguo(){
        List <Operador> operadores = new ArrayList<Operador>();
        for (Operador op : lista){
            if(op.isEstatus()){
                operadores.add(op);
            }
        }
        imprimir(operadores);
    }

    public static void  imprimir(List <Operador> lista){
        System.out.println("Lista filtrada");
        for (Operador op: lista){
            System.out.println(op);
        }
    }

    public static void filtroNuevo(){
        List <Operador> operadores = lista.stream()
                .filter( op ->  op.isEstatus() )
                .collect(Collectors.toList());
        imprimirNuevo(operadores);
    }

    public static void imprimirNuevo(List<Operador> operadores){
        System.out.println("Lista filtrada");
        operadores.forEach(op -> System.out.println(op));
    }
}
