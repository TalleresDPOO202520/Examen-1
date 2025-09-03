


public class Hombre extends Persona {
    public Hombre(String nombre, int edad, double peso, double altura) {
        super(nombre, edad, peso, altura);
    }

    public double calcularTMB() {
        if (peso >= 60 && peso <= 110 && altura >= 160 && altura <= 195 && edad > 15) {
            return 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
        } else {
            throw new IllegalThreadStateException("Datos inválidos para hombre");
        }
    }
}