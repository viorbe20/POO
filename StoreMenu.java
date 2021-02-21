import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/********************************************************************
 * Ejercicio: Diseñando GESTISIMAL
 * ********************************************************************
 * Enunciado Elaborar una aplicación para el control de artículos de un almacén.
 * ********************************************************************
 * Clase StoreMenu que recoge el menú que se mostrará en el test de forma que el usuario
 * pueda escoger dentro de las opciones que se le muestren.
 *********************************************************************
 * @author Virginia Ordoño Bernier
 * ********************************************************************
 */

public class StoreMenu {

  String title;
  List<String> options; // Contiene los números de opciones.

  // El array es un nuevo array que lo inicializo con una lista.
  public StoreMenu(String title, String... options) {
    this.title = title;
    this.options = new ArrayList<>(Arrays.asList(options));
  }

  // Mostramos el menú.
  public int chose() {

    // Mostramos el menú
    System.out.println(this.title);
    System.out.println("-".repeat(this.title.length()) + "\n");

    for (int i = 0; i < this.options.size(); i++) {
      System.out.println((i + 1) + ". " + this.options.get(i));
    }
    System.out.print("\nIntroduce una opción: "); // Aparece al final del menú.

    // Leemos la opción.
    @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in);
    int option = s.nextInt();

    while (option <= 0 || option > this.options.size()) {
      System.out.print("Esa opción no es correcta. Introduce otra: "); // En caso de opción incorrecta.
      option = s.nextInt();
    }
    return option;
  }

  /*
   * Método toString.
   * @return String Almacén
   */
  @Override
  public String toString() {
    return "Menú Almacén: Título =" + title + "| Opciones =" + options + ".";
  }
}
