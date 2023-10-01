package org.familia.org.familia.proyecto4.repositories;

import org.familia.org.familia.proyecto4.models.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PerfilRepository extends JpaRepository <Perfil, Long>{
}
