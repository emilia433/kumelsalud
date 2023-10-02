package org.familia.org.familia.proyecto4.services;

import org.familia.org.familia.proyecto4.models.Ficha;
import org.familia.org.familia.proyecto4.models.Usuario;

import java.util.List;

public interface FichaService {

    List<Ficha> listaFichas();

    Ficha crearFicha(Ficha nuevaFicha);

    void borrarFicha(Long id);

    Ficha actualizarFichaPorId(Long id, Ficha fichaActualizado);

    Ficha obtenerFichaPorId(Long id);


}
