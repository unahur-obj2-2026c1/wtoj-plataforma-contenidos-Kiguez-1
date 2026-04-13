package ar.edu.unahur.obj2.w2j.contenido;

public class Documental extends Contenido{
    
    public Documental(Double costoBase , String titulo) {
        super(costoBase , titulo);
    }
    
    @Override
    public Double costoExtra() {
        return
            IDRA.getInstance().getCosto();
    }
}
