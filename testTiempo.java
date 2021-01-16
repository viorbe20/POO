

/**********************************************************************

1. Crea la clase Tiempo. 
Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:

t = Tiempo(1, 20, 30)

donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. 

Crea métodos para:

Sumar y restar otro objeto de la clase Tiempo (el resultado es otro objeto).
Sumar y restar segundos, minutos y/o horas (se cambia el objeto actual).
Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) 
la cadena sea 10h 35m 5s.
Realiza un programa de prueba para comprobar que la clase funciona bien.
*********************************************************************
*Análisis
**********************************************************************
 * 1. Creamos la clase y sus atributos: segundos, minutos, horas.
 * 2. Creamos método contructor para que pida los parámetros indicados y calculamos los segundos totales
 * para poder operar entre diferentes objetos.
 * 3. Creamos un método que sume dos objetos de la clase Tiempo y devuelva el resultado en segundos.
 *4. Creamos un método que convierta una cantidad de segundos en segundos, minutos y horas, para 
 *luego mostrarlo por pantalla. 
 * 
 * *********************************************************************
 * Programa de prueba
 * *********************************************************************
 * 1. Creamos dos objetos de la clase Tiempo con generadores aleatorios de números entre 0 y 60.
 * 2. Imprimimos el resultado de la suma.
 *  */

/**
 * @author Virginia
 *
 */
public class testTiempo {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // Generamos números aleatorios para crear dos objetos.
    int horas = (int) (Math.random() * 61);
    int minutos = (int) (Math.random() * 61);
    int segundos = (int) (Math.random() * 61);

    Tiempo t1 = new Tiempo(horas, minutos, segundos);

    horas = (int) (Math.random() * 61);
    minutos = (int) (Math.random() * 61);
    segundos = (int) (Math.random() * 61);

    Tiempo t2 = new Tiempo(horas, minutos, segundos);
    
    /*
     * Resultado.
     */
  
t1.sumarCon(t2);
  }

}
