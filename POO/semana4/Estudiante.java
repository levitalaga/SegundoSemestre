public class Estudiante {
 
    // Atributos de los estucalificaciones 
    private String nombre;
    private int id;
    private String curso;
    private double nota1;
    private double nota2;
    private double nota3;

    //Constructor
    public Estudiante (int id, String nombre, String curso, double nota1, double nota2, double nota3) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
     
    public Estudiante(Object id2, Object nombre2, Object curso2, Object nota12, Object nota22, Object nota32) {
        //TODO Auto-generated constructor stub
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String toString() {
        return "Estudiante [ id: " + id + ", nombre: " + nombre + ", curso: " + curso + ", nota1: " + nota1 + ", nota2: " + nota2 + ", nota3: " + nota3 + "]";
    } 
}
