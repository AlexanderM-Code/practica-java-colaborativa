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


    // Método: Calcular Promedio
    public double calcularPromedio() {
        if (cantidadNotas == 0) {
            return 0; // Evitar división por cero si no hay notas
        }

        double suma = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            suma += notas[i];
        }
        return suma / cantidadNotas;
    }
}