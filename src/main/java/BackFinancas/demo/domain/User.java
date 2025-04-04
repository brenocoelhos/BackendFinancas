package BackFinancas.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class User {
    private String nome;
    private String senha;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}