package ar.edu.unahur.obj2.w2j.contenido;

public class Pelicula extends Contenido {

    public Pelicula (Double costoBase , String titulo) {
        super(costoBase, titulo);
    }

    @Override
    public Double costoExtra() {
        return
            0.0;
    }
    
}
