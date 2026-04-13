package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.Usuario;

public class PlanFamiliar extends PlanBasico{
    
    public PlanFamiliar(Integer cantContenido , Double costo) {
        super(cantContenido, costo);
    }

    @Override
    public Double importeDeUsuario(Usuario unUsuario) {
        return
            super.importeDeUsuario(unUsuario) * 0.85;
    }
}
