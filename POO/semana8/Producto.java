public abstract class Producto {
    //Atributos de los productos
    private int numero;
    private double precio;

    //Constructor
    public Producto( int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        if (precio>=0) {
            this.precio = precio;

        } else {
            System.out.println ( "El precio no puede ser negativo");
        }
    }

    @Override 
    public String toString () {
        return "numero: " + numero + ", precio: " + precio;
    }

}
