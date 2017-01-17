package Main;

/**
 * Created by sa.tinajero on 13/01/2017.
 */
public interface IEscribible {
    public void escribir (String url);
    public IEscribible leer(String url,long timestamp);
}
