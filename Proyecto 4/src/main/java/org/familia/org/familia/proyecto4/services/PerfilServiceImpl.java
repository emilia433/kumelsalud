package org.familia.org.familia.proyecto4.services;

import jakarta.transaction.Transactional;
import org.familia.org.familia.proyecto4.models.Ficha;
import org.familia.org.familia.proyecto4.models.Perfil;
import org.familia.org.familia.proyecto4.repositories.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PerfilServiceImpl implements PerfilService{

    @Autowired
    PerfilRepository perfilRepository;


    @Override
    public List<Perfil> listaDePerfiles() {
        return perfilRepository.findAll();
    }

    @Override
    public Perfil crearPerfil(Perfil nuevoPerfil) {
        return perfilRepository.save(nuevoPerfil);
    }

    @Override
    public void borrarPerfil(Long id) {
        perfilRepository.deleteById(id);
    }

    @Override
    public Perfil actualizarPerfilPorId(Long id, Perfil perfilActualizado) {
        Boolean existe = perfilRepository.existsById(id);
        if (existe) {
            Perfil perfilSeleccionado = perfilRepository.findById(id).get();
            perfilSeleccionado.setNombrePerfil(perfilActualizado.getNombrePerfil());
            perfilSeleccionado.setEdadPerfil(perfilActualizado.getEdadPerfil());
            perfilSeleccionado.setAntecedentePerfil(perfilActualizado.getAntecedentePerfil());
            System.out.println("El perfil ha sido actualizado");
            return perfilRepository.save(perfilSeleccionado);
        } else {
            System.out.println("El perfil no existe o el id es inválido");
            return null;
        }
    }

    @Override
    public Perfil obtenerPerfilPorId(Long id) {
        Boolean existe = perfilRepository.existsById(id);

        if(existe){
            Perfil perfilEscogido = perfilRepository.findById(id).get();
            return perfilEscogido;
        }else{
            System.out.println("El id es inválido o no existe");
            return null;
        }
    }
}
