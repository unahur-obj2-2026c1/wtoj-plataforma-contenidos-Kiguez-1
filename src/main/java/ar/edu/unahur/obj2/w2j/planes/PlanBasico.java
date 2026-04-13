package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.Usuario;
import ar.edu.unahur.obj2.w2j.contenido.*;

public class PlanBasico implements Cobrable{

    private Integer cantContenido;
    private Double costo;

    public PlanBasico(Integer cantContenido , Double costo) {
        this.cantContenido = cantContenido;
        this.costo = costo;
    }

    public Integer getCantContenido() {
        return
            cantContenido;
    }

    public Double getCosto() {
        return
            costo;
    }

    @Override
    public Double importeDeUsuario(Usuario unUsuario) {
            if (unUsuario.getContenidos().size() > cantContenido) {
                return 
                    costo + this.costoBaseDeContenidoExtra(unUsuario.getContenidos().subList(2, unUsuario.getContenidos().size()));
            } else {
                return
                    costo;
            }
    }

    public Double costoBaseDeContenidoExtra(List<Contenido> contenidoExtra) {
        return
            contenidoExtra.stream().mapToDouble(contenido -> contenido.getCostoBase()).sum();
    }
    
}
