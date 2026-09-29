public class EjecutarAuto {
    public static void main(String[] args) {
        // Crear un objeto de la clase Auto
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, "Blanco", 15000, 
        20000.0, 22000.0, "ABC123");
        
        // Mostrar la información del auto
        System.out.println(auto1.toString());

        Auto auto2 = new Auto("Kia", "seltos", 2024, "gris", 30000, 
        20000000.0, 22000000.0, "MXN334");
        System.out.println(auto2.toString());

        System.out.println ("Ganancia del auto 1: " + auto1.calcularGanancia());
        auto1.vender();
        auto1.vender(); // Intentar vender el auto nuevamente
    }
}
