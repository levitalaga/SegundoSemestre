public class CuentaBancaria {
    // Atributos de la clase
    double saldo;
    String titular;
    String numeroCuenta;
    String tipoCuenta;

    // Método mostrarInformacion()
    /* firma del método:
       public : Es público
       void : no retorna nada
       mostrarInformacion() : Es el nombre del método, no recibe parámetros
    */
    public void mostrarInformacion(){
        System.out.println("saldo: " + saldo);
        System.out.println("titular: " + titular);
        System.out.println("numeroCuenta: " + numeroCuenta);
        System.out.println("tipoCuenta: " + tipoCuenta);
    }
}