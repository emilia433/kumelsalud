package org.familia.org.familia.proyecto4.controllers;

import org.familia.org.familia.proyecto4.models.Controles;
import org.familia.org.familia.proyecto4.models.Ficha;
import org.familia.org.familia.proyecto4.services.ControlesService;
import org.familia.org.familia.proyecto4.services.ControlesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controles")
public class ControlesRestControllers {

    @Autowired
    ControlesServiceImpl controlesService;

    @GetMapping("/lista")
    public List<Controles> listaDeControles() {
        List<Controles> mostrarListaControles = controlesService.listaDeControles();
        return mostrarListaControles;
    }

    @PostMapping("/nuevo")
    public Controles crearControl(@RequestBody Controles nuevoControl){
        Controles controlParaGuardar= controlesService.crearControl(nuevoControl);
        return controlParaGuardar;
    }

    @DeleteMapping("/{id}")
    public String borrarControl(@RequestParam Long id) {
        controlesService.borrarControl(id);
        return "El control ha sido borrado";
    }

    @PutMapping("/editar/{id}")
    public Controles actualizarControlPorId(@PathVariable Long id, @RequestBody Controles controlesActualizado){
        Controles controlesEditado = controlesService.actualizarControlporId(id, controlesActualizado);
        return controlesEditado;


    }
    @GetMapping("/{id}")
    public Controles obtenerControlPorId(@PathVariable Long id){
        Controles controlMostrar = controlesService.obtenerControlPorId(id);
        return controlMostrar;
    }














}
