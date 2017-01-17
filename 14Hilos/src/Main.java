/**
 * Created by sa.tinajero on 16/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++){
            HiloNuevo h = new HiloNuevo(x);
            Thread t = new Thread(h);
            t.start();
        }
    }
}
