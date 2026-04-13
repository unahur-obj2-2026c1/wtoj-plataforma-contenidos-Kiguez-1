package ar.edu.unahur.obj2.w2j.contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    List<Episodio> episodios = new ArrayList<>();
    private Integer numerotemporada;

    public Temporada (Integer numerotemporada) {
        this.numerotemporada = numerotemporada;
    }

    public List<Episodio> getEpisodios() {
        return
            episodios;
    }

    public Integer getNumeroTemporada() {
        return
            numerotemporada;
    }

    public void agregarEpisodio(Episodio unEpisodio) {
        episodios.add(unEpisodio);
    }

    public Integer cantidadDeEpisodiosDeTemporada() {
        return
            episodios.size();
    }

    public Double costoDeEpisodiosDeTemporada() {
        return
            episodios.stream().mapToDouble(episodio -> episodio.costoLicencia()).sum();
    }
}
