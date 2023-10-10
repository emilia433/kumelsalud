package org.familia.org.familia.proyecto4.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;


    private String usuarioNombre;


    private String correoElectronico;


    private String contrasena;


    private String textoAdicional;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaRegistro;


    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Perfil> perfil;




}
