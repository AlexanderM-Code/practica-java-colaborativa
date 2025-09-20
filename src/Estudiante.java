public class Estudiante {
    private String nombre;
    private int edad;
    private double[] notas;
    private int cantidadNotas;
    private int capacidadNotas;

    public Estudiante(String nombre, int edad, int capacidadNotas) {
        this.nombre = nombre;
        this.edad = edad;
        this.capacidadNotas = capacidadNotas;
        this.notas = new double[capacidadNotas];
        this.cantidadNotas = 0;
    }
}
