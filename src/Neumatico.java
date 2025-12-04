/**
 * Extiende ComponenteVehicular, añadiendo atributos y un comportamiento específico
 * para la especialización Neumatico.
 */
public class Neumatico extends ComponenteVehicular {
    // Atributos específicos del Neumático
    int tamaño;
    double presion; // en PSI

    /**
     * Constructor para la clase Neumatico. Llama al constructor de la clase base.
     * @param codigo Código del neumático.
     * @param fabricante Fabricante del neumático.
     * @param tamaño Tamaño en pulgadas.
     * @param presion Presión actual en PSI.
     */
    public Neumatico(String codigo, String fabricante, int tamaño, double presion) {
        super(codigo, fabricante);
        this.tamaño = tamaño;
        this.presion = presion;
    }

    /**
     * Sobrescribe el método de la clase base para incluir información del neumático.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño: " + tamaño + " pulgadas");
        System.out.println("Presión: " + presion + " PSI");
    }

    /**
     * Comportamiento particular: verifica si la presión está en el rango óptimo (30-35 PSI).
     */
    public void verificarPresion() {
        if (presion >= 30.0 && presion <= 35.0) {
            System.out.println("Presión óptima. El neumático está listo.");
        } else {
            System.out.println("Presión fuera del rango recomendado (30-35 PSI). ¡Revisar!");
        }
    }
}