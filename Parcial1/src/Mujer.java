


public class Mujer extends Persona {
    public Mujer(String nombre, int edad, double peso, double altura) {
        super(nombre, edad, peso, altura);
    }

    public double calcularTMB() {
        if (peso >= 40 && peso <= 80 && altura >= 140 && altura <= 180 && edad > 15) {
            return 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
        } else {
            throw new IllegalArgumentException("Datos inválidos para mujer");
        }
    }
}

