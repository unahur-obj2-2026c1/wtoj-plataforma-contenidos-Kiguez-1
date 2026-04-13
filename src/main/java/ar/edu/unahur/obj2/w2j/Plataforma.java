package ar.edu.unahur.obj2.w2j;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    
    private static Plataforma instance = new Plataforma();
    List<Usuario> usuarios = new ArrayList<>();

    private Plataforma() {}

    public static Plataforma getInstance() {
        return instance;
    }

    public List<Usuario> getUsuarios() {
        return
            usuarios;
    }

    public void agregarUsuario(Usuario unUsuario) {
        usuarios.add(unUsuario);
    } 

    public Double facturacionTotal() {
        return
            usuarios.stream().mapToDouble(usuario -> usuario.importeMensual()).sum();
    }

    public void borrarContenidoDeUsuarios() {
        usuarios.forEach(usuario -> usuario.eliminarTodosLosContenidos());
    }
}
