package POO.semana4;

public class EjecutarEstudiante {
    public static void main(String[] args) {

        // Creación del objeto
        Estudiante objEst1 = new Estudiante(2627, "Jose", "Fisica", 3.0, 4.0, 5.0);

        System.out.println(objEst1.toString());

        // Se usa el método de la clase en lugar de escribir las notas a mano
        System.out.println("Promedio: " + objEst1.calcularPromedio());
    }
}
