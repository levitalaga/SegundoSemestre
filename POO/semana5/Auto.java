public class Auto {
    // atributos del auto
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private int kilometraje;
    private double precioCompra;
    private double precioVenta;
    private String placa;
    private boolean vendido;

    //El constructor de la clase permite inicializar la clase
    public Auto (String marca, String modelo, int anio, String color, int kilometraje, double precioCompra, double precioVenta, 
        String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.kilometraje = kilometraje;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.placa = placa;
        this.vendido = false; // Inicialmente el auto no está vendido
        
    }
    public String toString() { 
        return "Auto [marca: " + marca + ", modelo: " + modelo + ", anio: " 
        + anio + ", color: " + color + ", kilometraje: " + kilometraje + ", precioCompra: " 
        + precioCompra + ", precioVenta: " + precioVenta + ", placa: " + placa + ", vendido: " + vendido + "]";
    }

    //Ganancia del auto
    public double calcularGanancia() {
        return precioVenta - precioCompra;
    }

    public void vender() {
        if (!vendido) {
            vendido = true;
            System.out.println("El auto ha sido vendido.");
        } else {
            System.out.println("El auto ya ha sido vendido.");
        }
    }
}