

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
class Tiempo {

  // Atributos de clase

  int segundosTotales;
 

  // Método constructor.
  public Tiempo(int hh, int mm, int ss) { // Pasaremos esos tres parámetros para la creación de cada objeto.
    this.segundosTotales = (hh * 3600) + (mm * 60) + ss; // Calcularemos el total de segundos en la creación de cada objeto.
  }

  //Método get para pedir segundos totales.
  int getSegundosTotales( ) {
    return this.segundosTotales;
  }
  
  // Método que sume los segundos totales de dos intervalos de tiempo y devuelva el resultado.
   void sumarCon(Tiempo sumando) {
    int sumaDosObjetos = this.segundosTotales + sumando.getSegundosTotales();
   //Si la cantidad de segundos es mayor a sesenta.
    if (sumaDosObjetos > 60) {
      int mm = sumaDosObjetos / 60; // Obtenemos los minutos.
      int ss = sumaDosObjetos % 60; //Segundos finales < 60.
        if (mm > 60) { //En caso que los minutos sean > 60.
          int hh = mm / 60;
          mm = mm % 60;
          System.out.println("La suma de los dos elementos es: " + hh + "h " + mm + "m " + ss + "s.");
        }else { //En caso que los minutos sean menos que 60.
          System.out.println( "La suma de los dos elementos es: 0h " + mm + "m " + ss + "s.");
        }
    } else { //termina if inicial
    System.out.println("La suma de los dos elementos es: 0h 0m " + sumaDosObjetos + " s."); 
}
   
}//metodo sumacon
   
}//class
