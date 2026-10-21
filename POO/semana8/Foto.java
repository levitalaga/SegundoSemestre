public class Foto {
  
    //Atributo
    private String fichero;

    //Constructor
    public Foto (String fichero) {
        this.fichero = fichero;
    }

    //Getter y Setter
    public String getFichero(){
        return fichero;
    }

    public void setFichero(String fichero) {
        this. fichero = fichero;

    }

    //Metodos 
    public void print () {
        System.out.println("Imprimiendo foto: " + fichero);
    }
    @Override 
    public String toString () {
        return "Foto [ fichero: " + fichero + "]";
    }     
}