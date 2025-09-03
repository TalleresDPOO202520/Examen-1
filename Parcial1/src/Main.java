


public class Main {
    public static void ejecutar() {
    	
        Persona h = new Hombre("pepito", 28, 83.2, 180);
        Persona m = new Mujer("juanita", 32, 66.5, 165);

        try {
            System.out.println(h.getNombre()+ "tiene un TMB de:" + ((Hombre)h).calcularTMB());
        } catch (IllegalArgumentException error) {
            System.out.println("Error con " + h.getNombre() + ": " + error.getMessage());
        }

        try {
        	System.out.println(m.getNombre()+ "tiene un TMB de:" + ((Mujer)m).calcularTMB());
        } catch (IllegalArgumentException error) {
            System.out.println("Error con " + m.getNombre() + ": " + error.getMessage());
        }
    }

    public static void main(String[] args) {
        ejecutar();
    }
}
