import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // 1. CLIENTES
        Cliente cliente1 = new Cliente("1107123456", "Levi Talaga");
        Cliente cliente2 = new Cliente("1144987654", "Ana Torres");
        Cliente cliente3 = new Cliente("1130555777", "Carlos Ruiz");

        // 2. FOTOS
        Foto foto1 = new Foto("playa.jpg");
        Foto foto2 = new Foto("cumpleanos.png");
        Foto foto3 = new Foto("graduacion.jpg");
        Foto[] fotosVacaciones = { foto1, foto2, foto3 };

        // 3. PRODUCTOS
        Camara camara1 = new Camara(1001, 1500000.0, "Canon", "EOS R50");
        Camara camara2 = new Camara(1002, 900000.0, "Sony", "ZV-1");
        Impresion impresion1 = new Impresion(2001, 15000.0, "Color", fotosVacaciones);

        // 4. PAGOS (polimorfismo: variables tipo Pago con distintas hijas)
        Pago pago1 = new TarjetaCredito("1234567890123456");
        Pago pago2 = new Efectivo(1000000.0);
        Pago pago3 = new Transferencia("Bancolombia", "REF-78452");

        // 5. PEDIDOS
        Producto[] productosPedido1 = { camara1, impresion1 };
        Pedido pedido1 = new Pedido(cliente1, productosPedido1, LocalDate.now(), pago1);

        Producto[] productosPedido2 = { camara2 };
        Pedido pedido2 = new Pedido(cliente2, productosPedido2, LocalDate.now(), pago2);

        Producto[] productosPedido3 = { impresion1 };
        Pedido pedido3 = new Pedido(cliente3, productosPedido3, LocalDate.now(), pago3);

        // 6. MOSTRAR PEDIDOS
        pedido1.mostrarPedido();
        pedido2.mostrarPedido();
        pedido3.mostrarPedido();

        // 7. PRUEBAS
        System.out.println("===== PRUEBAS =====");
        impresion1.imprimirFotos();
        camara1.setPrecio(-500);
        cliente1.setNombre("Levi Joel Talaga");
        System.out.println("Nombre actualizado: " + cliente1);
    }
}