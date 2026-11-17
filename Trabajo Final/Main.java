public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de ascensores iniciado");

        SensorObstaculo sensor = new SensorObstaculo();
        System.out.println(sensor);

        sensor.simularObstaculo(true);
        System.out.println("Hay obstaculo? " + sensor.hayObstaculo());
        System.out.println(sensor); 
    }
}