package Planes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.Plataforma;
import ar.edu.unahur.obj2.w2j.Usuario;
import ar.edu.unahur.obj2.w2j.contenido.*;
import ar.edu.unahur.obj2.w2j.planes.*;


import org.junit.jupiter.api.BeforeEach;

public class PlanesTest {
    
    private Cobrable planBasico = new PlanBasico(2, 5000.0);
    private Cobrable planPremium = new PlanPremium(7000.0);
    private Cobrable planFamiliar = new PlanFamiliar(2, 5500.0);
    private Usuario ludmila = new Usuario(planBasico);
    private Usuario matias = new Usuario(planPremium);
    private Serie peakyBlinders = new Serie(5000.0, "peaky blinders");
    private Pelicula viernes13 = new Pelicula(3000.0 , "viernes 13");
    private Documental guerraFria = new Documental(2000.0, "la guerra fria");

    @BeforeEach
    void init() {
        Plataforma.getInstance().agregarUsuario(ludmila);
        Plataforma.getInstance().agregarUsuario(matias);
        ludmila.registrarContenido(peakyBlinders);
        ludmila.registrarContenido(viernes13);
        matias.registrarContenido(guerraFria);
        matias.registrarContenido(peakyBlinders);
        matias.registrarContenido(viernes13);
    }

    void reiniciar() {
        Plataforma.getInstance().borrarContenidoDeUsuarios();
        Plataforma.getInstance().getUsuarios().clear();
        this.init();
    }

    @Test
    void verificarCostoDePlanBasicoSinExcedente() {
        assertEquals(5000.0, ludmila.importeMensual());
    }

    @Test
    void verificarCostoDePlanBasicoConExcedente() {
        ludmila.registrarContenido(guerraFria);
        assertEquals(7000.0, ludmila.importeMensual());
    }

    @Test
    void verificarCostoDePlanPremium() {
        assertEquals(7000.0, matias.importeMensual());
    }

    @Test
    void verificarCostoDePlanFamiliarSinExcedente() {
        ludmila.setPlanUsuario(planFamiliar);
        assertEquals(4675.0, ludmila.importeMensual());
    }

    @Test
    void verificarCostoDePlanFamiliarConExcedente() {
        ludmila.registrarContenido(guerraFria);
        ludmila.setPlanUsuario(planFamiliar);
        assertEquals(6375.0, ludmila.importeMensual());
    }

    @Test
    void verificarFacturacionTotalDePlataforma() {
        this.reiniciar();
        assertEquals(12000.0, Plataforma.getInstance().facturacionTotal());
    }

    @Test
    void verificarBorradoDeContenido() {
        Plataforma.getInstance().borrarContenidoDeUsuarios();
        assertEquals(0, ludmila.getContenidos().size());
        assertEquals(0, matias.getContenidos().size());
    }

}
