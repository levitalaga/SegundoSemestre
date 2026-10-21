import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("1107123456", "Levi Talaga");
        Cliente cliente2 = new Cliente("1144987654", "Stiven Talaga");

        Foto foto1 = new Foto("playa.jpg");
        Foto foto2 = new Foto("cumpleanos.png");
        Foto foto3 = new Foto("graduacion.jpg");
        Foto[] fotosVacaciones = { foto1, foto2, foto3 };

        Camara camara1 = new Camara(1001, 1500000.0, "Canon", "EOS R50");
        Camara camara2 = new Camara(1002, 900000.0, "Sony", "ZV-1");
        Impresion impresion1 = new Impresion(2001, 15000.0, "Color", fotosVacaciones);

        Producto[] productosPedido1 = { camara1, impresion1 };
        Pedido pedido1 = new Pedido(cliente1, productosPedido1, LocalDate.now(), "1234567890123456");

        Producto[] productosPedido2 = { camara2 };
        Pedido pedido2 = new Pedido(cliente2, productosPedido2, LocalDate.now(), "9876543210987654");

        pedido1.mostrarPedido();
        pedido2.mostrarPedido();

        System.out.println("===== PRUEBAS =====");
        impresion1.imprimirFotos();

        camara1.setPrecio(-500);

        // Cambiar un dato con un setter
        cliente1.setNombre("Levi Joel Talaga");
        System.out.println("Nombre actualizado: " + cliente1);
    }
}