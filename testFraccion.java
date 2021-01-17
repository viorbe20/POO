import java.util.Scanner;

/**
 * 
 */

/**
 * @author Virginia
 *
 */
public class testFraccion {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    /*
     * Declaramos variables.
     */
    
    int numerador = 0; 
    int denominador = 0;
    int opcion;
    boolean continuar = true; //Hace salir del bucle.
    Fraccion f1 = new Fraccion (numerador, denominador);
    Fraccion f2 = new Fraccion (numerador, denominador);
    
    @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in);
    System.out.println("\n\nEste programa muestra distintas operaciones con una fracción.");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println("\nIntroduce los valores de la fraccion.");
    System.out.print("\nIntroduce el numerador: ");
    numerador = s.nextInt();
    System.out.print("\nIntroduce el denominador: ");
    denominador = s.nextInt();

    /*
     * Pedimos datos.
     */
    do {
      opcion = menuFraccion(); //El programa salta directamente a la función.
      switch (opcion) {
        case 1:
          System.out.println("\n\nEl resultado de la fracción es:");
          @SuppressWarnings("unused") 
          Scanner s1 = new Scanner(System.in);
          numerador = s.nextInt();
          denominador = s.nextInt();
          System.out.println("El resultado de dividir los elementos de la fracción es:" +  f1.getResultado());
          break;
        case 2:
          @SuppressWarnings("unused") 
          Scanner s2 = new Scanner(System.in);
          System.out.println("Introduce un número entero: ");
          numerador = s.nextInt();
          denominador = 1;
          System.out.println("La multiplicación de la fracción y el número es:" +  f1.multiplicaNumero(f2));
          break;
        case 3:
          @SuppressWarnings("unused") 
          Scanner s4 = new Scanner(System.in);
          System.out.println("Introduce los elementos de la fracción.");
          System.out.println("Introduce el numerador: ");
          numerador = s.nextInt();
          System.out.println("Introduce el denominador: ");
          denominador = s.nextInt();
          System.out.println("La multiplicación de las dos fracciones es:" +  f1.multiplicaFraccion(f2));
          break;
        case 4:
          System.out.println("Introduce los elementos de la fracción.");
          System.out.println("Introduce el numerador: ");
          numerador = s.nextInt();
          System.out.println("Introduce el denominador: ");
          denominador = s.nextInt();
          System.out.println("La suma de las dos fracciones es:" +  f1.sumaFraccion(f2));
          break;
        case 5:
          System.out.println("Introduce los elementos de la fracción.");
          System.out.println("Introduce el numerador: ");
          numerador = s.nextInt();
          System.out.println("Introduce el denominador: ");
          denominador = s.nextInt();
          System.out.println("La resta de las dos fracciones es:" +  f1.restaFraccion(f2));
          //Fraccion.restaMultiplicacion(numerador, denominador);
          break;
        case 6:
          continuar = false; //Si introduce 6, cambia a false.
          break;
        default:
          System.err.println("Opción incorrecta.");
          break;    
      }
    } while (continuar = true); //Cuando es false, sale del bucle.
    System.out.println("\n\n¡Adiós!");
  } // public static void main(String[] args)
  
  
  //Creamos el menú que aparecerá al usuario.
  public static int menuFraccion() {
    System.out.println("\nMenú de opciones");
    System.out.println("----------------------");
    System.out.println("Introduce un número para escoger una opción.");
    System.out.println("1) Obtener resultado de la fracción (número real).");
    System.out.println("2) Multiplica la fracción por un número entero.");
    System.out.println("3) Multiplica la fracción con otra fracción");
    System.out.println("4) Suma la fracción con otra fracción");
    System.out.println("5) Resta la fracción con otra fracción");
    System.out.println("6) Simplifica la fracción.");
    System.out.println("7) Salir\n\n");

    // Leo la opción.
    @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in); // Clase Scanner para leer datos.
    System.out.print("Introduce una opción: ");
    return s.nextInt();  
  
  } //Menú fracción.

}//public class

 

