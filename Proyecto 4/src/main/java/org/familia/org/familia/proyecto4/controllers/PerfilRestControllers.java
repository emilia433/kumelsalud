package org.familia.org.familia.proyecto4.controllers;

import org.familia.org.familia.proyecto4.models.Perfil;
import org.familia.org.familia.proyecto4.services.PerfilService;
import org.familia.org.familia.proyecto4.services.PerfilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfil")
public class PerfilRestControllers {

    @Autowired
    PerfilServiceImpl perfilService;

    @GetMapping("/lista")
    public List<Perfil> listaPerfil() {
        List<Perfil> listaMostrar = perfilService.listaDePerfiles();
        return perfilService.listaDePerfiles();
    }

    @PostMapping("/nuevo")
    public Perfil crearPerfil(@RequestBody Perfil perfilNuevo) {
        Perfil perfilParaGuardar = perfilService.crearPerfil(perfilNuevo);
        return perfilParaGuardar;
    }

    @DeleteMapping("/borrar")
    public String borrarPerfil(@RequestParam Long id) {
        perfilService.borrarPerfil(id);
        return "El perfil ha sido borrado";
    }

    @PutMapping("/editar/{id}")
    public Perfil actualizarPerfilPorId(@PathVariable Long id, @RequestBody Perfil perfilActualizado) {
        Perfil perfilEditado = perfilService.actualizarPerfilPorId(id, perfilActualizado);
        return perfilEditado;
    }

    @GetMapping("/{id}")
    public Perfil obtenerPerfilPorId(@PathVariable Long id) {
        Perfil perfilMostrar = perfilService.obtenerPerfilPorId(id);
        return perfilMostrar;
    }
}
