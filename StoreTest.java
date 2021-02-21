/********************************************************************
 * Ejercicio: Diseñando GESTISIMAL
 * ********************************************************************
 * Enunciado Elaborar una aplicación para el control de artículos de un almacén.
 * ********************************************************************
 * Clase StoreTest que muestra el menú con el usuario de forma que
 * pueda escoger dentro de las opciones que se le muestren.
 *********************************************************************
 * @author Virginia Ordoño Bernier
 * ********************************************************************
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreTest {

  // Opciones del menú
  static int option;
  static StoreMenu menu =
      new StoreMenu("\nGestión de almacén", "Añadir un artículo.", "Eliminar un artículo.",
          "Incrementar existencias.", "Decrementar existencias.", "Mostrar un artículo.", "Salir.");

  // Clase Almacén.
  static List<Integer> arrayList1 = new ArrayList<>();
  static Store articlesList = new Store(arrayList1);

  // Clase artículo.
  static Article myArticle = new Article("Libro", 20.00, 22.00, 20);

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in);
    do {
      option = menu.chose();

      switch (option) {
        case 1:
          System.out.println("Introduce un nombre para añadir un nuevo artículo: ");
          String name = s.next();
          myArticle.setDescription(name);
          System.out.println("Introduce el precio de compra: ");
          double price = s.nextDouble();
          if (price >= 0) {
            myArticle.setPurchasePrice(price);
          } else {
            System.err.println("Debes introducir un valor positivo.");
          }
          System.out.println("Introduce el precio de venta: ");
          price = s.nextDouble();
          if (price >= 0) {
            myArticle.setSalePrice(price);
          } else {
            System.err.println("Debes introducir un valor positivo.");
            System.out.println("Introduce las unidades: ");
            int n = s.nextInt();
            myArticle.setUnits(n);
            myArticle.setId();
            articlesList.addArticle(myArticle.getId()); // Añadimos el nuevo id a la lista.
          }
          break;
        case 2:
          System.out.println("Introduce un código para eliminar un artículo: ");
          int n = s.nextInt();
          articlesList.removeArticle(n);
          break;
        case 3:
          System.out.println("Introduce un número para incrementar las existencias del artículo: ");
          n = s.nextInt();
          myArticle.addUnits(n);
          break;
        case 4:
          System.out.println("Introduce un número para decrementar las existencias del artículo:");
          n = s.nextInt();
          myArticle.removeUnits(n);
          break;
        case 5:
          System.out
              .println("Introduce un código para indicar el artículo que quieres que se muestre: ");
          n = s.nextInt();
          articlesList.getArticle(n);
          break;
        case 6:
          System.out.println("Hasta la próxima.");
        default:
          break;
      }
    } while (option != 6);
  }
}

