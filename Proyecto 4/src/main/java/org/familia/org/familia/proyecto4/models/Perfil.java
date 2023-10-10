package org.familia.org.familia.proyecto4.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long perfilId;



    private String nombrePerfil;


    private Integer edadPerfil;


    private String antecedentePerfil;



    @JsonIgnore
    @ManyToOne
    @JoinColumn (name = "usuario_id", nullable = false)
    private Usuario usuario;

    @JsonManagedReference
    @OneToMany(mappedBy = "perfil")
    private List<Controles> controles;

}
