public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de ascensores iniciado");

        Puerta puerta = new Puerta("Puerta del ascensor");
        System.out.println(puerta);

        puerta.abrir();
        puerta.mantenerAbierta(10);

        puerta.getSensor().simularObstaculo(true);     // alguien se atraviesa
        System.out.println("¿Se cerró? " + puerta.cerrar());

        puerta.getSensor().simularObstaculo(false);    // la persona se quita
        System.out.println("¿Se cerró? " + puerta.cerrar());

        System.out.println(puerta);
    }
}