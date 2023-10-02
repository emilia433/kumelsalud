package org.familia.org.familia.proyecto4.services;


import org.familia.org.familia.proyecto4.models.Controles;

import java.util.List;

public interface ControlesService {

    List<Controles> listaDeControles();

    Controles crearControl(Controles nuevoControl);

    
    Controles actualizarControlporId(Long id, Controles controlActualizado);
    

    void borrarControl(Long id);

    boolean editarControlPorId(Long id);
}
