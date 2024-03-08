package CalcAreaPerimetro;
/**
 * Esta clase es el punto de entrada del programa y se utiliza para probar la clase Circulo.
 */
public class Main {

    /**
     * Metodo principal que crea un circulo, calcula su area y perimetro, y luego imprime los resultados.
     * @param args Los argumentos de la linea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        // Crear un circulo con radio 5
        Circulo circulo = new Circulo(5);

        // Calcular el area y el perimetro del circulo
        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();

        // Imprimir los resultados
        System.out.println("Area del circulo: " + area);
        System.out.println("Perimetro del circulo: " + perimetro);
    }
}