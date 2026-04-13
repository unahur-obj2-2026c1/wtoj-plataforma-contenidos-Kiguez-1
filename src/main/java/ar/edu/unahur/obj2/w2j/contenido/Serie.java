package ar.edu.unahur.obj2.w2j.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{

    List <Temporada> temporadas = new ArrayList<>();

    public Serie (Double costoBase , String titulo) {
        super(costoBase , titulo);
    }

    public List<Temporada> getTemporadas() {
        return
            temporadas;
    }

    public void agregarTemporada(Temporada unaTemporada) {
        temporadas.add(unaTemporada);
    }

    @Override
    public Double costoExtra() {
        return
            this.costoDeEpisodiosDeSerie() /
            this.cantidadDeEpisodiosDeSerie();
    }

    public Double costoDeEpisodiosDeSerie() {
        return
            temporadas.stream().mapToDouble(temporada -> temporada.costoDeEpisodiosDeTemporada()).sum();
    }

    public Integer cantidadDeEpisodiosDeSerie() {
        return
            temporadas.stream().mapToInt(temporada -> temporada.cantidadDeEpisodiosDeTemporada()).sum();
    }
    
}
