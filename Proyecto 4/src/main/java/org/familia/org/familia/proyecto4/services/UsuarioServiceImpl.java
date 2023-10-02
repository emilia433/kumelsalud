package org.familia.org.familia.proyecto4.services;

import org.familia.org.familia.proyecto4.models.Perfil;
import org.familia.org.familia.proyecto4.models.Usuario;
import org.familia.org.familia.proyecto4.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository UsuarioRepository;

    @Override
    public List<Usuario> listaDeUsuarios() {
        return UsuarioRepository.findAll();
    }

    @Override
    public Usuario crearUsuario(Usuario nuevoUsuario){
        return UsuarioRepository.save(nuevoUsuario);
    }

    @Override
    public void borrarUsuario(Long id) {
        UsuarioRepository.deleteById(id);
    }

    @Override
    public Usuario actualizarUsuarioPorId(Long id, Usuario usuarioActualizado) {
        Boolean existe = UsuarioRepository.existsById(id);
        if (existe){
            Usuario usuarioSeleccionado = UsuarioRepository.findById(id).get();
            usuarioSeleccionado.setUsuarioNombre(usuarioActualizado.getUsuarioNombre());
            usuarioSeleccionado.setCorreoElectronico(usuarioActualizado.getCorreoElectronico());
            usuarioSeleccionado.setContrasena(usuarioActualizado.getContrasena());
            usuarioSeleccionado.setTextoAdicional(usuarioActualizado.getTextoAdicional());
            System.out.println("El Usuario se ha actualizado");
            return UsuarioRepository.save(usuarioSeleccionado);
        }else {
            System.out.println("El Usuario no existe");
            return null;
        }
    }

    public Usuario obtenerUsuarioPorId(Long id) {
        Boolean existe = UsuarioRepository.existsById(id);

        if(existe){
            Usuario usuarioEscogido = UsuarioRepository.findById(id).get();
            return usuarioEscogido;
        }else{
            System.out.println("El id es inválido o no existe");
            return null;
        }
    }


}
