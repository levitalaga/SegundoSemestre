package POO.semana6;

public class EjecutarInventario {
    public static void main(String[] args) {

        // Creación de los tres productos
        Producto producto1 = new Producto("P001", "Laptop", 1500.0, 10);
        Producto producto2 = new Producto("P002", "Smartphone", 800.0, 20);
        Producto producto3 = new Producto("P003", "Audífonos", 50.0, 0);

        // Imprimir los productos directamente (usa toString())
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

        // Valor del inventario de cada producto y total de la tienda
        System.out.println("\nValor inventario " + "Laptop: " + producto1.calcularValorInventario());
        System.out.println("Valor inventario " + "Smartphone: " + producto2.calcularValorInventario());
        System.out.println("Valor inventario " + "Audífonos: " + producto3.calcularValorInventario());

        double total = producto1.calcularValorInventario() + producto2.calcularValorInventario()
                + producto3.calcularValorInventario();
        System.out.println("Valor total del inventario: " + total);
    }
}