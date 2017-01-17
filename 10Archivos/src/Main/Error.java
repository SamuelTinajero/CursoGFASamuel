package Main;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.Date;

/**
 * Created by sa.tinajero on 13/01/2017.
 */
public class Error implements IEscribible{
    private long timeStamp;
    private int codigoError;
    private String descripcion;

    public Error() {
    }

    public Error(int codigoError, String descripcion) {
        this.timeStamp = new Date().getTime();
        this.codigoError = codigoError;
        this.descripcion = descripcion;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void escribir(String url) {
        try {
            FileOutputStream fo = new FileOutputStream(url,true);
            OutputStreamWriter os  = new OutputStreamWriter(fo,"UTF-8");
            BufferedWriter bw = new BufferedWriter(os);

            String linea = timeStamp + " | " + codigoError + " | " + descripcion+" \n ";
            bw.write(linea);
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Tipo de codificacion no soportada.");
        } catch (IOException e) {
            System.out.println("Error de IO");
        } catch (Exception ex){
            System.out.println("Otro error");
        }finally {

        }
    }

    @Override
    public IEscribible leer(String url, long timestamp) {
        try {
            FileReader fr = new FileReader(url);
            BufferedReader br = new BufferedReader(fr);
            String linea ;
            while((linea = br.readLine()) != null){
                String [] sl = linea.split("-");
                if( Long.parseLong(sl[0].trim()) == timestamp ){
                    this.timeStamp = timestamp;
                    this.codigoError = Integer.parseInt(sl[1]);
                    this.descripcion = sl[2].trim();
                    return this;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error ID");
        }

        return null;
    }

    @Override
    public String toString(){
        return timeStamp + " - " + codigoError + " - " + descripcion;
    }
        /*try {
            FileWriter fw = new FileWriter(url,true);
            String linea = timeStamp + " | " + codigoError + " | " + descripcion+" \n ";
            fw.append(linea);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/




}
