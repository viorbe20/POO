/********************************************************************
 * Ejercicio: Diseñando GESTISIMAL
 * ********************************************************************
 * Enunciado Elaborar una aplicación para el control de artículos de un almacén.
 * ********************************************************************
 * Crea la clase Artículo que representa a los artículos del almacén. 
 * 
 * Estado: 
 * código,
 * descripción, 
 * precio de compra, 
 * precio de venta, 
 * número de unidades (nunca negativas), 
 * stock de seguridad
 * stock máximo.
 * 
 *  Comportamiento
 *  Consideramos que el código va a generarse de forma automática en el constructor, 
 *  así no puede haber dos artículos con el mismo código. Esto implica
 * que no puede modificarse el código de un artículo, sí el resto de las propiedades. Podremos
 * mostrar el artículo, por lo que necesito una representación del artículo en forma de cadena
 * (toString).
 *********************************************************************
 * @author Virginia Ordoño Bernier
 * ********************************************************************
 */
public class Article {

  // Constante
  private static int ID_ACTUAL = 1;         // Inicializamos el código del artículo.

  // Variables de instancia.
  private int id;                                                  //Código del artículo.
  private String description;                   //Nombre del artículo.
  private double purchasePrice;         // Precio de compra.
  private double salePrice;                   // Precio de venta
  private int units;

  /*
   * Método constructor.
   * Genera un código único.
   * @param description, purachasePrice, salePrice, units
   */
  public Article(String description, double purchasePrice, double salePrice, int units) {
    this.id = setId(); // Cada vez que se crea un objeto se le asigna un código con un número más que
                                       // el anterior.
    this.description = description;
    
    if (checkPositive((int) purchasePrice)) {           //Comprobamos que el precio de la compra no sea un número negativo.
      this.purchasePrice = purchasePrice;
    }
    if (checkPositive((int) salePrice)) {                       // Comprobamos que el precio de la venta no sea un número negativo.
      this.purchasePrice = purchasePrice;
    }
    if (checkPositive(units)) {                                         // Comprobamos que el número de unidades no sea un número negativo.
      this.purchasePrice = purchasePrice;
    }
  }

  // Getters y setters

  /**
   * Getter descripción del producto.
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Setter descripción del producto.
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter precio de compra.
   * @return the purchasePrice
   */
  public double getPurchasePrice() {
    return purchasePrice;
  }

  /**
   * Setter precio de compra.
   * @param set purchasePrice
   */
  public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  /**
   * Getter del precio de venta
   * @return the salePrice
   */
  public double getSalePrice() {
    return salePrice;
  }

  /**
   * Setter del precio de venta
   * @param salePrice
   */
  public void setSalePrice(double salePrice) {
    this.salePrice = salePrice;
  }

  /*
   * Getter del número de unidades.
   * @return units
   */
  public int getUnits() {
    return this.units;
  }

  /*
   * Setter número de unidades.
   * @param number
   */
  public int setUnits(int number) {
    return number + this.units; // Añadimos las unidades nuevas a las que ya teníamos.
  }

  /*
   * Método que devuelve el último código generado.
   * @return id
   */
  public int getId() {
    return this.id;
  }

  /*
   * Setter código.
   * @return nuevo id
   */
  public int setId() {
    return this.id = ID_ACTUAL++;
  }

  // Otros métodos.

  /*
   * Método que muestra el artículo.
   * @return article
   */
  @Override
  public String toString() {
    return "Artículo: Id => " + id + "| Descripción => " + description + "| Precio de compra => "
        + purchasePrice + "| Precio de Venta => " + salePrice + "| Unidades => " + units + ".";
  }

  /*
   * Método que comprueba que un número no es negativo.
   * @return true or false
   */
  public boolean checkPositive(int number) {
    if (number < 0) {
      System.err.println("El valor no puede ser negativo.");
      return false;
    } else {
      return true;
    }
  }

  /*
   * Método que incrementa las existencias de un artículo.
   * @param units
   */
  public void addUnits(int units) {
    if (checkPositive(units)) {          // Comprueba que el número no sea negativo.
      this.units = getUnits() + units;
    }
  }

  /*
   * Método que decrementa las existencias de un artículo.
   * 
   * @param units
   */
  public void removeUnits(int units) {
    // Comprobar si el artículo ya existe ¿o eso lo hace e almacen?
    if (checkPositive(units)) { // Comprueba que el número no sea negativo.
    } else if (units > this.units) {
      System.err
          .println("El número que quieres eliminar es mayor que el número de unidades en stock.");
    } else {
      this.units = this.units - units; // Si el número es menor que el del stock, se resta.
    }
  }
}
