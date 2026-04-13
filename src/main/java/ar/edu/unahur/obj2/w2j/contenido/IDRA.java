package ar.edu.unahur.obj2.w2j.contenido;

public class IDRA {
    
    private double costo = 0.5;
    private static IDRA instance = new IDRA();

    private IDRA() {}

    public static IDRA getInstance() {
        return
            instance;
    }

    public double getCosto() {
        return
            costo;
    }

    public void setCosto(Double newCosto) {
        costo = newCosto;
    }
}
