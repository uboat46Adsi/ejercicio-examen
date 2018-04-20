package mx.com.itam.adsi.ejercicio;

import org.apache.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal{
  private final static Logger LOG = Logger.getLogger(Principal.class);

  public static void main(String...argv) {
    Principal p = new Principal();
    LOG.info("Contar comentarios de System.out.print('Hello')// => Hello :" + p.cuenta("System.out.print('Hello')// => Hello"));
  }
  public int[] cuenta(String source) throws FileNotFoundException, IOException { 
        FileReader f = new FileReader(source);
        BufferedReader b = new BufferedReader(f);
        String line = null;
        while(line = b.readLine()) {
            LOG.info("Lineas :" + line);
        }
        b.close();
    int[] counter = {0, 0, 0};//[TOTAL, COMENTARIOS, EJECUTABLES]
    /*int i = source.indexOf("//");

    if(i >= 1){
      counter[1]++;
      counter[2]++;
      counter[0]++;
    }else if(i == 0){
      counter[1]++;
      counter[0]++;
    }
    LOG.info("Cantidad de lineas :" + counter[0]);
    LOG.info("Cantidad de comments :" + counter[1]);
    LOG.info("Cantidad de exes :" + counter[2]);
    */
    return counter;
  }
}