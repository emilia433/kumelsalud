package org.familia.org.familia.proyecto4.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "perfil")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PerfilId;


    @NotNull
    private String nombrePerfil;

    private Integer edadPerfil;

    private String AntecedentePerfil;

    @OneToOne
    private Usuario usuario;



    @OneToMany(mappedBy = "perfil")
    private List<Controles> controles;

}
