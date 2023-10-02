package org.familia.org.familia.proyecto4.services;

import jakarta.transaction.Transactional;
import org.familia.org.familia.proyecto4.models.Ficha;
import org.familia.org.familia.proyecto4.repositories.FichaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class FichaServiceImpl implements FichaService{

    @Autowired
    FichaRepository fichaRepository;

    @Override
    public List<Ficha> listaFichas(){
    return fichaRepository.findAll();
    }

    @Override
    public Ficha crearFicha(Ficha nuevaFicha) {
        return fichaRepository.save(nuevaFicha);
    }

    @Override
    public void borrarFicha(Long id) {
    fichaRepository.deleteById(id);
    }


    @Override
    public Ficha actualizarFichaPorId(Long id, Ficha fichaActualizado) {
        Boolean existe = fichaRepository.existsById(id);
        if (existe){
            Ficha fichaSeleccionado = fichaRepository.findById(id).get();
            fichaSeleccionado.setFechaCreacion(fichaActualizado.getFechaCreacion());
            fichaSeleccionado.setAntecedentesMedicos(fichaActualizado.getAntecedentesMedicos());
            fichaSeleccionado.setFechaNacimiento(fichaActualizado.getFechaNacimiento());
            fichaSeleccionado.setGenero(fichaActualizado.getGenero());
            fichaSeleccionado.setPrevision(fichaActualizado.getPrevision());
            fichaSeleccionado.setTipoDeSangre(fichaActualizado.getTipoDeSangre());
            fichaSeleccionado.setRelacionParental(fichaActualizado.getRelacionParental());
            System.out.println("La ficha ha sido actualizada");
            return fichaRepository.save(fichaSeleccionado);
        }else {
            System.out.println("La ficha no existe o el id es inválido");
            return null;
        }
    }

    @Override
    public Ficha obtenerFichaPorId(Long id) {
        Boolean existe = fichaRepository.existsById(id);

        if(existe){
            Ficha fichaEscogido = fichaRepository.findById(id).get();
            return fichaEscogido;
        }else{
            System.out.println("El id es inválido o no existe");
            return null;
        }
    }
}
