/**
 * Extiende ComponenteVehicular, añadiendo atributos y un comportamiento específico
 * para la especialización Chasis.
 */
public class Chasis extends ComponenteVehicular {
    // Atributos específicos del Chasis
    String tipo;
    double peso; // en kg

    /**
     * Constructor para la clase Chasis. Llama al constructor de la clase base.
     * @param codigo Código del chasis.
     * @param fabricante Fabricante del chasis.
     * @param tipo Tipo de chasis (e.g., "Monocasco", "Bastidor").
     * @param peso Peso del chasis en kg.
     */
    public Chasis(String codigo, String fabricante, String tipo, double peso) {
        super(codigo, fabricante);
        this.tipo = tipo;
        this.peso = peso;
    }

    /**
     * Sobrescribe el método de la clase base para incluir información del chasis.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de chasis: " + tipo);
        System.out.println("Peso: " + peso + " kg");
    }

    /**
     * Comportamiento particular: calcula la carga máxima estimada (ejemplo: peso * 3.5).
     */
    public void calcularCargaMaxima() {
        double cargaMax = peso * 3.5;
        System.out.println("Carga máxima estimada: " + String.format("%.2f", cargaMax) + " kg");
    }
}