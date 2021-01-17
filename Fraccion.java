

/**********************************************************************
 * 2. Crea una clase Fraccion de forma que podamos hacer las siguientes operaciones:
 * Contruir un objeto Fraccion pasándole el numerador y el denominador.
 * Obtener la fracción como cadena de caracteres.
 * Obtener y modificar numerador y denominador. No se puede dividir por cero.
 * Obtener resultado de la fracción (número real).
 * Multiplicar la fracción por un número (el resultado es otro objeto fracción).
 * Multiplicar, sumar y restar fracciones (el resultado es otro objeto fracción).
 * Simplificar la fracción (cambia el objeto actual).
*********************************************************************
*POO Tanda 1. Ejercicio 2.
*********************************************************************
*Análisis
**********************************************************************
 */

/**
 * @author Virginia
 *
 */
public class Fraccion {
  
    //Atributos
  int numerador;
  int denominador;
  int numero;
  double fraccion;
  double numeroReal;
  private double resultado;

  //1. Método constructor. Pide los dos elementos y excluye fracciones con denominador 0.
  public Fraccion(int n, int d) {
    if (d == 0) {
      //System.err.print("El denominador no puede ser 0.");
    } else {
      this.numerador = n;
      this.denominador = d;
    }
  }
  
//2. Método que pasa fracción a cadena de caracteres.
  public String toString(){
    int numerador = this.numerador;
    int denominador = this.denominador;
    return numerador + " / " + denominador; 
  }

  //3. Obtener y modificar numerador y denominador. No se puede dividir por cero.
  int getNumerador () {
    return this.numerador;
  }
  
  //3. Obtiene denominador.
  int getDenominador() {
    return this.denominador;
  }
  
  //4. Obtiene numero real.
  double getReal (int n, int d) {
    this.numerador = Math.abs(n);
    this.denominador = Math.abs(d);
    numeroReal = this.numeroReal / this.denominador;
    return this.numeroReal;
  }

  //Métodos del menú.
  
  //1. Resultado de la fracción.
  double getResultado () {
    resultado = (double)this.numerador / (double)this.denominador;
    return this.resultado;
  }
  
  //5. Multiplica la fracción por un número.
  public Fraccion multiplicaNumero(Fraccion f) { //Para un número entero el denominador será 1.
    return new Fraccion(this.numerador * f.getNumerador(), this.denominador * 1);
  }
  
  //6. Multiplica, suma y resta con otras fracciones.
  public Fraccion multiplicaFraccion(Fraccion f) { 
    return new Fraccion(this.numerador * f.getNumerador(), this.denominador * getDenominador());
  }
  
  public Fraccion sumaFraccion(Fraccion f) { //Para un número entero el denominador será 1.
    return new Fraccion(this.numerador + f.getNumerador(), this.denominador + getDenominador());
  }
  
  public Fraccion restaFraccion(Fraccion f) { //Para un número entero el denominador será 1.
    return new Fraccion(this.numerador - f.getNumerador(), this.denominador - getDenominador());
  }
    
  
  
  //7. Simplifica la fracción.
  
}
