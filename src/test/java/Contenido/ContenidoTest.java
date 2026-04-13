package Contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.contenido.Documental;
import ar.edu.unahur.obj2.w2j.contenido.Episodio;
import ar.edu.unahur.obj2.w2j.contenido.Pelicula;
import ar.edu.unahur.obj2.w2j.contenido.Serie;
import ar.edu.unahur.obj2.w2j.contenido.Temporada;

import org.junit.jupiter.api.BeforeEach;

public class ContenidoTest {

    private Pelicula titanic = new Pelicula(4000.0, "Titanic");
    private Serie peakyBlinders = new Serie(10000.0 , "Peaky Blinders" );
    private Temporada temporada1 = new Temporada(1);
    private Temporada temporada2 = new Temporada(2);
    private Episodio ep1 = new Episodio(100.0, "ep1" , 1);
    private Episodio ep2 = new Episodio(100.0, "ep2" , 2);
    private Episodio ep3 = new Episodio(100.0, "ep3" , 3);
    private Episodio ep4 = new Episodio(100.0, "ep4" , 4);
    private Episodio ep1T2 = new Episodio(500.0, "ep1T2" , 1);
    private Episodio ep2T2 = new Episodio(600.0, "ep2T2" , 2);
    private Episodio ep3T2 =  new Episodio(700.0, "ep3T2" , 3);
    private Documental segundaGuerramundial = new Documental(5000.0 , "La segunda guerra mundial");
    
    @BeforeEach 
    private void init() {
        temporada1.agregarEpisodio(ep1);
        temporada1.agregarEpisodio(ep2);
        temporada1.agregarEpisodio(ep3);
        temporada1.agregarEpisodio(ep4);
        temporada2.agregarEpisodio(ep1T2);
        temporada2.agregarEpisodio(ep2T2);
        temporada2.agregarEpisodio(ep3T2);
        peakyBlinders.agregarTemporada(temporada1);
        peakyBlinders.agregarTemporada(temporada2);
    }

    @Test
    void calcularCostoTotalDeSerie() {
        assertEquals(10314.28, peakyBlinders.costoLicencia() , 0.01);
    }

    @Test
    void calcularCostoTotalDeDocumental() {
        assertEquals(5000.5, segundaGuerramundial.costoLicencia());
    }

    @Test
    void verificarCostoTotalDePelicula() {
        assertEquals(4000, titanic.costoLicencia());
    }

}
