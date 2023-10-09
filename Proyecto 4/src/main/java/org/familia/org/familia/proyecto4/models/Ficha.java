package org.familia.org.familia.proyecto4.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;


@Entity
@Table(name = "ficha")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ficha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fichaId;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaCreacion;


    private String antecedentesMedicos;


    private String alergias;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;


    private String genero;


    private String prevision;


    private String tipoDeSangre;


    private String relacionParental;

    @OneToOne
    private Perfil perfil;

}
