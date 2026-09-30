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

    public String toString() {
        return "Producto [codigo: " + codigo + ", nombre: " + nombre + ", precio: " + precio + ", cantidad: " + cantidad + "]";
    }

    public void agregarStock(int cantidad) {
        this.cantidad += cantidad;
    }
    public void calcularInventario() {
        double valorInventario = precio * cantidad;
        System.out.println("El valor del inventario del producto " + nombre + " es: " + valorInventario);
    }

    public void venderUnidades(int cantidad) {
        if (cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println(" Se ha vendido " + cantidad + " unidades de " + nombre);

        }else {
            System.out.println("No hay suficiente Stock de " + nombre);
        }
    }
}

