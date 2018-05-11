package br.edu.unievangelica.domain.produto;

import br.edu.unievangelica.domain.category.Category;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_seq")
    @SequenceGenerator(name = "produto_id_seq", sequenceName = "produto_id_seq", allocationSize = 1)
    @Column(name = "id")
    @Getter
    private long id;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "nome")
    @Getter
    @Setter
    private String name;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "marca")
    @Getter
    @Setter
    private String marca;

    @NotEmpty
    @Size(max = 500)
    @Column(name = "descricao")
    @Getter
    @Setter
    private String descricao;

    @Column(name = "preco")
    @Getter
    @Setter
    private float preco;

    @Column(name = "category")
    @Getter
    @Setter
    private long category;


}
