package br.edu.unievangelica.domain.provincia;

import br.edu.unievangelica.domain.pais.Pais;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "provincia")
@JsonIgnoreProperties({"municipios"})
public class Provincia implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "provincia_id_seq")
    @SequenceGenerator(name = "provincia_id_seq", sequenceName = "provincia_id_seq", allocationSize = 1)
    @Column(name = "id")
    @Getter
    private long id;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "nome")
    @Getter
    @Setter
    private String nome;

    @Size(max = 5)
    @Column(name = "sigla")
    @Getter
    @Setter
    private String sigla;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pais_id", referencedColumnName = "id")
    @Getter
    @Setter
    private Pais pais;


}
