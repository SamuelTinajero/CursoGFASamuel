public class Operaciones {
    public int suma ( int [] arreglo){
        int resultado = 0;
        for (int x = 0 ; x<arreglo.length; x++) resultado =resultado+arreglo[x];
        return resultado;
    }
    public int media ( int [] arreglo){
        int x,resultado = 0;
        for ( x = 0 ; x<arreglo.length; x++) resultado =resultado+arreglo[x];
        return resultado/x;
    }
    public int mayor ( int [] arreglo){
        int resultado = -1;
        for (int x = 0 ; x< arreglo.length; x++) if(arreglo[x] > resultado) resultado = arreglo[x]  ;
        return resultado;
    }




    public int generico(int [] arreglo,int salida){
        int suma = 0,mayor =-1,x = 0;
        for (x = 0 ; x<arreglo.length; x++){
            suma = suma + arreglo[x];
            if(arreglo[x] > mayor) mayor = arreglo[x]  ;
        }
        if (salida == 1) return suma;
        else if (salida == 2) return suma/x;
        else if (salida == 3) return mayor;
        else return 0;
    }
}
