public class Camara extends Producto {
    //Atributos 
    private String marca;
    private String modelo;

    //Constructor 
    public Camara( int numero, double precio, String marca, String modelo) {
        super(numero, precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters y Setters
    public String getMarca() {
        return marca;
    }
    public String getModelo () {
        return modelo;
    }

    @Override
    public String toString () {
        return "Camara [" + super.toString() + ", marca: " + marca + ", modelo: " + modelo + "]";
    } 
}
