public class Puerta {


    private String id;                 
    private boolean abierta;           
    private int segundosAbierta;      
    private boolean conFalla;          
    private SensorObstaculo sensor;    

    
    public Puerta(String id) {
        this.id = id;
        this.abierta = false;                  
        this.segundosAbierta = 5;              
        this.conFalla = false;                 
        this.sensor = new SensorObstaculo();   
    }



   
    public void abrir() {
        this.abierta = true;
        System.out.println(id + " se abrió");
    }

   
    public boolean cerrar() {
        if (sensor.hayObstaculo()) {
            System.out.println(id + ": ¡obstáculo detectado! No se cierra");
            return false;
        } else {
            this.abierta = false;
            this.segundosAbierta = 5;
            System.out.println(id + " se cerró");
            return true;
        }
    }

   
    public void mantenerAbierta(int segundos) {
        if (segundos > 0) {
            this.segundosAbierta = this.segundosAbierta + segundos;
            System.out.println(id + " se mantiene abierta " + segundos + " segundos más");
        }
    }

  
    public boolean estaAbierta() {
        return abierta;
    }

    public SensorObstaculo getSensor() {
        return sensor;
    }

    public String getId() {
        return id;
    }

   
    public void simularFalla() {
        this.conFalla = true;
    }

   
    public boolean tieneFalla() {
        return conFalla;
    }

   
    public String toString() {
        return "Puerta{id=" + id + ", abierta=" + abierta
                + ", segundosAbierta=" + segundosAbierta + ", conFalla=" + conFalla + "}";
    }
}