package org.familia.org.familia.proyecto4.controllers;

import org.familia.org.familia.proyecto4.models.Usuario;
import org.familia.org.familia.proyecto4.services.UsuarioService;
import org.familia.org.familia.proyecto4.services.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")

public class UsuarioRestControllers {

    @Autowired
    UsuarioServiceImpl UsuarioService;

    @GetMapping("/lista")
    public List<Usuario> listaDeUsuarios(){
        return UsuarioService.listaDeUsuarios();
    }

    @PostMapping("/nuevo")
    public Usuario crearUsuario(@RequestBody Usuario nuevoUsuario){
        return UsuarioService.crearUsuario(nuevoUsuario);
    }

    @PutMapping("/editar/{id}")
    public Usuario actualizarUsuarioPorId(@PathVariable Long id, @RequestBody Usuario usuarioActualizado){
        Usuario usuarioEditado = UsuarioService.actualizarUsuarioPorId(id, usuarioActualizado);
        return usuarioEditado;
    }

    @DeleteMapping("/borrar")
    public String borrarUsuario(@RequestParam Long id){
        UsuarioService.borrarUsuario(id);
        return "El Usuario ha sido borrado";
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id){
        Usuario usuarioMostrar = UsuarioService.obtenerUsuarioPorId(id);
        return usuarioMostrar;
    }
}
