


public class Persona {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected double altura;

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }
}
