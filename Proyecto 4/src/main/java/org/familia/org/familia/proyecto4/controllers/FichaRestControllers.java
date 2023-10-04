package org.familia.org.familia.proyecto4.controllers;

import org.familia.org.familia.proyecto4.models.Ficha;
import org.familia.org.familia.proyecto4.services.FichaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ficha")
public class FichaRestControllers {
    @Autowired
    FichaServiceImpl fichaService;

    @GetMapping("/lista")
    public List<Ficha> enlistarFichas(){
        return fichaService.listaFichas();
    }

    @PostMapping("/nuevo")
    public Ficha nuevaFicha(@RequestBody Ficha nuevaFicha){
        return fichaService.crearFicha(nuevaFicha);
    }

    @PutMapping("/editar/{id}")
    public Ficha actualizarFichaPorId(@PathVariable Long id, @RequestBody Ficha fichaActualizado){
        Ficha fichaEditado = fichaService.actualizarFichaPorId(id, fichaActualizado);
        return fichaEditado;
    }

    @DeleteMapping("/borrar")
    public String borrarFicha(@RequestParam Long id){
        fichaService.borrarFicha(id);
        return "La ficha ha sido borrada";
    }

    @GetMapping("/{id}")
    public Ficha obtenerFichaPorId(@PathVariable Long id){
        Ficha fichaMostrar = fichaService.obtenerFichaPorId(id);
        return fichaMostrar;
    }

}
