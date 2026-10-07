package POO.semana6;

public class Producto {

    // Atributos de la clase
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Calcula el valor del inventario: precio * cantidad
    public double calcularValorInventario() {
        return precio * cantidad;
    }

    // toString: incluye los atributos y el valor calculado del inventario
    @Override
    public String toString() {
        return "Producto [codigo: " + codigo + ", nombre: " + nombre + ", precio: " + precio
                + ", cantidad: " + cantidad + ", valorInventario: " + calcularValorInventario() + "]";
    }
}