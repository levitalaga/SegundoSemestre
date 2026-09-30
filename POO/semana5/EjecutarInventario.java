public class EjecutarInventario {
    public static void main (String[] args) {
        // Crear un objeto de la clase Producto
        Producto producto1 = new Producto("P001", "Laptop", 1500.0, 10);
        
        // Mostrar la información del producto
        System.out.println(producto1.toString());


        Producto producto2 = new Producto("P002", "Smartphone", 800.0, 20);
        System.out.println(producto2.toString());

        producto1.calcularInventario();
        producto1.agregarStock(5);
        System.out.println(producto1.toString());

        producto1.venderUnidades(3);
        System.out.println(producto1.toString());

        producto1.venderUnidades(100);
        System.out.println(producto1.toString());
    } 
    
}
