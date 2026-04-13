package ar.edu.unahur.obj2.w2j.contenido;

public class Episodio extends Contenido{
    
    private Integer numeroEpisodio;

    public Episodio(Double costoBase , String titulo , Integer numeroEpisodio) {
        super(costoBase, titulo);
        this.numeroEpisodio = numeroEpisodio;
    }

    public Integer getNumeroEpisodio() {
        return
            numeroEpisodio;
    }

    @Override
    public Double costoExtra() {
        return
            0.0;
    }
}
