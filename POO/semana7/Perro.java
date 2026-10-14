package POO.semana7;

public class Perro extends Animal {
    
    private double peso;
    
    public Perro(String nombre, String familia, double peso){
        super(nombre, familia);
        this.peso = peso;
    }
    
    public void comer(){
        System.out.println("Perro comiendo....");
    }
    
    public void ladrar(){
        System.out.println("Guau guau..");
    }

    public double getPeso(){
        return peso;
    }
}