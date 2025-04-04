package BackFinancas.demo.repository;

import BackFinancas.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FinancasRepository extends JpaRepository<User, Long> {

}
