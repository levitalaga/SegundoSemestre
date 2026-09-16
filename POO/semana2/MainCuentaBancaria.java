public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria objCuenta1 = new CuentaBancaria();
        objCuenta1.saldo = 1500000;
        objCuenta1.titular = "Levi Talaga";
        objCuenta1.numeroCuenta = "1234567890";
        objCuenta1.tipoCuenta = "Ahorros";

        CuentaBancaria objCuenta2 = new CuentaBancaria();
        objCuenta2.saldo = 800000;
        objCuenta2.titular = "Ana Torres";
        objCuenta2.numeroCuenta = "9876543210";
        objCuenta2.tipoCuenta = "Corriente";

        objCuenta1.mostrarInformacion();
        objCuenta2.mostrarInformacion();
    }
}