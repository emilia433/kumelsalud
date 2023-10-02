package org.familia.org.familia.proyecto4.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "controles")
public class Controles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fichaId;

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

  @ManyToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;
}
