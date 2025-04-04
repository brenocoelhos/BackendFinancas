package BackFinancas.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    private String usuario;
    private String senha;
    @Id
    private Long id;
}