package BackFinancas.demo.repository;

import BackFinancas.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface FinancasRepository extends JpaRepository<User, Long> {
    Optional<User> findByNome(String nome);

    Optional<User> findBySenha(String senha);
}
