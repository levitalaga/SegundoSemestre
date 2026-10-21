public class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    public Impresion (int numero, double precio, String color, Foto[] fotos) {
        super(numero, precio);
        this.color = color;
        this.fotos = fotos;
    }

    public String getColor () {
        return color;
    }
    
    public void setColor (String color){
        this.color = color;
    }

    public Foto[] getFotos () {
        return fotos;
    }
    public int cantidadFotos() {
    return fotos.length;
}
    
    public void imprimirFotos () {
        System.out.println("Imprimiendo " + fotos.length + " fotos a " + color + ":");
        for (Foto foto : fotos) {
            foto.print();
        }
     }
     @Override
     public String toString() {
        return "Impresion[" + super.toString() + ", color:" + color + ", cantidad de fotos: " + fotos.length + "]"; 

     }

}
