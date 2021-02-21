import java.util.ArrayList;
import java.util.List;
/* * ********************************************************************
 * Ejercicio: Diseñando GESTISIMAL
 *  * ********************************************************************
 *   Enunciado Elaborar una aplicación para el control de artículos de un almacén.
 * ********************************************************************
 * Crea la clase Almacén que realice el alta, baja, modificación, entrada de mercancía (incrementa
 * unidades), salida de mercancía (decrementa unidades).
 *
 * Estado
 * ArrayList de artículos. Esta clase es un envoltorio de un ArrayList.
 *
 * Comportamiento
 * Añadir artículos (no puede haber dos artículos iguales), 
 * eliminar artículos, 
 * incrementar las existencias de un artículo (se delega en la clase Artículo),
 * decrementar las existencias de un artículo (nunca por debajo de cero, se delega en la clase
 * Artículo), 
 * devolver un artículo (para mostrarlo).
 * Para listar el almacén podría devolverse una cadena con todos los artículos del almacén
 * (toString).
 * * ********************************************************************
 * @author Virginia Ordoño Bernier
 *  * ********************************************************************
 */

public class Store {

  // Variables de clase.
  public List<Integer> articlesList = new ArrayList<>();

  /*
   * Método constructor.
   * @param arrayListArticles
   */
  public Store(List<Integer> articlesList) {
    this.articlesList = articlesList;
  }

  /*
   * Método que busca artículo igual al solicitado.
   * @param id
   * @return true or false
   */
  public boolean sameArticle(int id) {
    if (this.articlesList.contains(Integer.valueOf(id))) { // Busca un elemento con el mismo valor.
      return true;
    } else {
      return false;
    }
  }

  /*
   * Método que añade un artículo.
   * @param id
   * @return true or false
   */
  public boolean addArticle(int id) {
    if (sameArticle(id)) { // Busca un elemento con el mismo valor.
      System.err.println("No puede haber dos artículos iguales.");
      return false;
    } else {
      return articlesList.add(id); // Si no existe el elemento, lo añade.
    }
  }

  /*
   * Método que elimina un artículo en caso de que exista.
   * @param id
   * @return true or false
   */
  public boolean removeArticle(int id) {
    if (!sameArticle(id)) {
      System.err.println("El artículo indicado no existe.");        // Si no existe lanza un mensaje de error.
      return false;
    } else {
      articlesList.remove(id);      // Si existe, elimina el valor.
      return true;
    }
  }

  /*
   * Método que devuelve un artículo para mostrarlo.
   * @param id
   * @return id
   */
  public String getArticle(int id) {
    if (sameArticle(id)) {
      return "Artículo requerido: código " + id;
    } else {
      System.err.println("El artículo introducido no existe.");
      return null;
    }
  }

  /*
   * Método que devuelve una lista con los elementos del almacén en formato cadena.
   * @return articlesList
   */
  @Override
  public String toString() {
    return "Artículos del almacén: [" + articlesList + "]";
  }
}
