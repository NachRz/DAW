package CalcAreaPerimetro;

/**
 * Esta clase representa un circulo con un radio dado.
 */
public class Circulo {

   private double radio;

   /**
    * Constructor que crea un circulo con un radio dado.
    * @param radio El radio del circulo.
    */
   public Circulo(double radio) {
       this.radio = radio;
   }

   /**
    * Calcula el area del circulo.
    * @return El area del circulo.
    */
   public double calcularArea() {
       return Math.PI * radio * radio;
   }

   /**
    * Calcula el perimetro del circulo.
    * @return El perimetro del circulo.
    */
   public double calcularPerimetro() {
       return 2 * Math.PI * radio;
   }

   /**
    * Obtiene el radio del circulo.
    * @return El radio del circulo.
    */
   public double getRadio() {
       return radio;
   }

   /**
    * Establece el radio del circulo.
    * @param radio El nuevo radio del circulo.
    */
   public void setRadio(double radio) {
       this.radio = radio;
   }
}