package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.Usuario;

public class PlanPremium implements Cobrable {
    
    private Double costoMensual = 12.0;

    public PlanPremium(Double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public Double getCostoMensual() {
        return
            costoMensual;
    }

    @Override
    public Double importeDeUsuario(Usuario unUsuario) {
        return
            costoMensual;
    }
}
