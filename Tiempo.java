

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
*POO Tanda 1. Ejercicio 1.
*********************************************************************
*Análisis
**********************************************************************
 * 1. Creamos la clase y un atributo al que le asignaremos los segundos totales de cada objeto.
 * 2. Creamos método contructor para que pida los parámetros indicados y calculamos los segundos totales
 * para poder operar entre diferentes objetos.
 * 3. Creamos un método que pase los segundos totales a segundos, minutos y horas.
 * 4. Sumamos dos objetos.
 *5. Restamos dos objetos.. 
 * *********************************************************************
 * Programa de prueba
 * *********************************************************************
 * 1. Creamos dos objetos de la clase Tiempo con generadores aleatorios de números entre 0 y 60.
 * 2. Imprimimos el resultado de la suma y la resta.
 *  */

/**
 * @author Virginia
 *
 */
class Tiempo {

  // Atributos de clase

  int totalSegundos;
 

  // Método constructor.
  public Tiempo(int hh, int mm, int ss) { // Pasaremos esos tres parámetros para la creación de cada objeto.
    this.totalSegundos = (hh * 3600) + (mm * 60) + ss; // Calcularemos el total de segundos en la creación de cada objeto.
  }
  
  //Método constructor.
  public Tiempo(int s) { //?????????
    this.totalSegundos = s;
  }

  // Método get para obtener  segundos totales de todos los objetos que se creen.
  int getSegundos() {
    return this.totalSegundos;
  }
  
  //Método que pasa los segundos totales a minutos y horas y 
  //lo convierte en cadena.
  public String toString() {
   //Divide los segundos totales en segundos, minutos y horas.
    int segundos = this.totalSegundos; //Asigna los segundos totales a la variable.
    int horas = segundos / 3600; //Pasa los segundos a horas.
    segundos -= horas * 3600; //Calcula los segundos restantes
    int minutos = segundos / 60; //Calcula los minutos a partir de los segundos.
    segundos -= minutos * 60; //Calcula los minutos restantes.
    
    //En caso que los segundos totales sea < 0.
    if (this.totalSegundos < 0) {
      return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
    } else { //En caso contrario.
      return horas + "h " + minutos + "m " + segundos + "s";
    }
  } //Cierra método String toString() 
   
//Método que suma dos objetos.
  public Tiempo suma(Tiempo t) { //Le pasamos un objeto t.
    return new Tiempo(this.totalSegundos + t.getSegundos());
    //devuelve la suma de los segundos totales de mi objeto y el objeto que entre.
  }

  //Método que resta dos objetos.
  public Tiempo resta(Tiempo t) {
    return new Tiempo(this.totalSegundos - t.getSegundos());
  }
   
}//class
