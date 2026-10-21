public class Efectivo extends Pago {

    private double montoEntregado;

    public Efectivo(double montoEntregado) {
        this.montoEntregado = montoEntregado;
    }

    @Override
    public void procesarPago(double total) {
        if (montoEntregado >= total) {
            System.out.println("Pago de $" + total + " en efectivo. Cambio: $" + (montoEntregado - total));
        } else {
            System.out.println("Dinero insuficiente. Faltan $" + (total - montoEntregado));
        }
    }
}