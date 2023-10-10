package org.familia.org.familia.proyecto4.services;


import org.familia.org.familia.proyecto4.models.Controles;

import java.util.List;

public interface ControlesService {

    List<Controles> listaDeControles();

    Controles crearControl(Controles nuevoControl, Long id);


    Controles actualizarControlporId(Long id, Controles controlActualizado);

    void borrarControl(Long id);

    Controles obtenerControlPorId(Long id);
}
