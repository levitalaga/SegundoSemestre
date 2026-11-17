public class SensorObstaculo {
    private boolean obstaculoDetectado;
    private boolean activo;

    public SensorObstaculo() {
        this.obstaculoDetectado = false;
        this.activo = true;
    }

    public boolean hayObstaculo() {
        return obstaculoDetectado;
    }

    public void simularObstaculo(boolean valor) {
        this.obstaculoDetectado = valor;
    }

    public boolean isActivo() {
        return activo;
    }

    public String toString() {
        return "SensorObstaculo{obstaculo=" + obstaculoDetectado + ", activo=" + activo + "}";
    }

}
