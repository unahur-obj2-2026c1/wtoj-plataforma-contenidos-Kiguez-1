package ar.edu.unahur.obj2.w2j;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenido.*;
import ar.edu.unahur.obj2.w2j.planes.*;

public class Usuario {
    
    private Cobrable planUsuario;
    List <Contenido> contenidos = new ArrayList<>();

    public Usuario(Cobrable planUsuario) {
        this.planUsuario = planUsuario;
    }

    public Cobrable getPlanUsuario() {
        return planUsuario;
    }

    public void setPlanUsuario(Cobrable unPlan) {
        planUsuario = unPlan;
    }

    public void registrarContenido(Contenido unContenido) {
        contenidos.add(unContenido);
    }

    public void eliminarTodosLosContenidos() {
        contenidos.clear();
    }

    public List<Contenido> getContenidos() {
        return
            contenidos;
    }

    public Double importeMensual() {
        return
            planUsuario.importeDeUsuario(this);
    }

}
