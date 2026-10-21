import java.time.LocalDate;

public class Pedido {

    // 1. ATRIBUTOS
    private Cliente cliente;
    private Producto[] productos;
    private LocalDate fecha;
    private Pago pago;

    // 2. CONSTRUCTOR
    public Pedido(Cliente cliente, Producto[] productos, LocalDate fecha, Pago pago) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.pago = pago;
    }

    // 3. GETTERS
    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Pago getPago() {
        return pago;
    }

    // 4. MÉTODOS
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("===== PEDIDO =====");
        System.out.println(cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println("  - " + producto);
        }
        System.out.println("Total: $" + calcularTotal());
        pago.procesarPago(calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido [cliente: " + cliente.getNombre() + ", fecha: " + fecha
                + ", productos: " + productos.length + ", total: " + calcularTotal() + "]";
    }
}