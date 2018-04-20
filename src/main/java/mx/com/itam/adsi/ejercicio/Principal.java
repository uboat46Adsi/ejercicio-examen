package mx.com.itam.adsi.ejercicio;

import org.apache.log4j.Logger;

public class Principal{
  private final static Logger LOG = Logger.getLogger(Principal.class);

  public static void main(String...argv) {
    Principal p = new Principal();
    LOG.info("Contar comentarios de System.out.print('Hello')// => Hello :" + p.cuenta("System.out.print('Hello')// => Hello"));
  }
  public int[] cuenta(String source) {
    int[] counter = {0, 0, 0};//[TOTAL, COMENTARIOS, EJECUTABLES]
    int i = source.indexOf("//");

    if(i >= 1){
      counter[1]++
      counter[2]++;
      counter[0]++;
    }else if(i == 0){
      counter[1]++;
      counter[0]++;
    }

    return counter;
  }
}