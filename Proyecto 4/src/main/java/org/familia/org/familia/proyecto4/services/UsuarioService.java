package org.familia.org.familia.proyecto4.services;

import org.familia.org.familia.proyecto4.models.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> listaDeUsuarios();

    Usuario crearUsuario(Usuario nuevoUsuario);

    void borrarUsuario(Long id);

    Usuario actualizarUsuarioPorId(Long id, Usuario usuarioActualizado);

    Usuario obtenerUsuarioPorId(Long id);
}
