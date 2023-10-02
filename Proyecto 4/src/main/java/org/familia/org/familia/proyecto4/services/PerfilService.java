package org.familia.org.familia.proyecto4.services;

import org.familia.org.familia.proyecto4.models.Perfil;
import org.familia.org.familia.proyecto4.models.Usuario;

import java.util.List;

public interface PerfilService {
    List<Perfil> listaDePerfiles();

    Perfil crearPerfil(Perfil nuevoPerfil);

    void borrarPerfil(Long id);

    Perfil actualizarPerfilPorId(Long id, Perfil perfilActualizado);

    Perfil obtenerPerfilPorId(Long id);
}

