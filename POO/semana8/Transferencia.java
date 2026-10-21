public class Transferencia extends Pago {

    private String banco;
    private String numeroReferencia;

    public Transferencia(String banco, String numeroReferencia) {
        this.banco = banco;
        this.numeroReferencia = numeroReferencia;
    }

    @Override
    public void procesarPago(double total) {
        System.out.println("Pago de $" + total + " por transferencia desde " + banco
                + " (ref: " + numeroReferencia + ")");
    }
}