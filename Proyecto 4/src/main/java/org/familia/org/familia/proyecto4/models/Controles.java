package org.familia.org.familia.proyecto4.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@Table(name = "controles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Controles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long controlesId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaControl;

    private String especialidad;

    private String medico;

    private String diagnostico;

    private String observaciones;
    //provenientes del medico

    private String notas;
    //notas personalizadas de quien recibe la info


     /*
    @Lob
    private byte[] imagen;
     */

  @JsonIgnore
  @ManyToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;
}
