package org.familia.org.familia.proyecto4.services;

import jakarta.transaction.Transactional;
import org.familia.org.familia.proyecto4.models.Controles;
import org.familia.org.familia.proyecto4.repositories.ControlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public abstract class ControlesServiceImpl implements ControlesService {

    @Autowired
    ControlesRepository controlesRepository;

    @Override
    public List<Controles> listaDeControles() {
        return controlesRepository.findAll();
    }
    @Override
    public Controles crearControl(Controles controles) {
        return controlesRepository.save(controles);
    }

    @Override
    public void borrarControl(Long id) {
        controlesRepository.deleteById(id);
    }


    @Override
    public Controles actualizarControlporId(Long id, Controles controlesActualizado){return controlesActualizado;}

    /*
    @Override
    public Controles actualizarControlPorId(Long id, Controles controlActualizado) {
        Boolean existe = controlesRepository.existsById(id);

        if (existe) {
            Controles controlSeleccionado = controlesRepository.findById(id).get();
            controlSeleccionado.setFechaControl(controlActualizado.getFechaControl());
            controlSeleccionado.setEspecialidad(controlActualizado.getEspecialidad());
            controlSeleccionado.setMedico(controlActualizado.getMedico());
            controlSeleccionado.setDiagnostico(controlActualizado.getDiagnostico());
            controlSeleccionado.setObservaciones(controlActualizado.getObservaciones());
            controlSeleccionado.setNotas(controlActualizado.getNotas());
            System.out.println("El control ha sido actualizado");
            return controlesRepository.save(controlSeleccionado); // Debes guardar y devolver el control actualizado
        } else {
                System.out.println("El control no existe o el id es inválido");
                return null;
        }
    }


     */



}
  /*@Override
        public boolean obtenerControlPorId (Long id){
            return false;
        }*/


