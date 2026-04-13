package ar.edu.unahur.obj2.w2j.contenido;

public abstract class Contenido {

    private Double costoBase;
    private String titulo;

    public Contenido (Double costoBase , String titulo) {
        this.costoBase = costoBase;
        this.titulo = titulo;
    }

    public Double getCostoBase() {
        return
            costoBase;
    }

    public String getTitulo() {
        return
            titulo;
    } 

    public void setCostoBase(Double newCostobase) {
        costoBase = newCostobase;
    }

    public Double costoLicencia() {
        return
            costoBase + this.costoExtra();
    }

    public abstract Double costoExtra();
    
}
