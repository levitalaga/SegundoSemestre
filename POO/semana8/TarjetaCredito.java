public class TarjetaCredito extends Pago {

    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String ocultarTarjeta() {
        return "**** **** **** " + numeroTarjeta.substring(numeroTarjeta.length() - 4);
    }

    @Override
    public void procesarPago(double total) {
        System.out.println("Pago de $" + total + " con tarjeta " + ocultarTarjeta());
    }
}