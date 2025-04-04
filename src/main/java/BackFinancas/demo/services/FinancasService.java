package BackFinancas.demo.services;

import BackFinancas.demo.repository.FinancasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import BackFinancas.demo.domain.User;

@Service
public class FinancasService {

    @Autowired
    private FinancasRepository financasRepository;

    public User salvar(User user) {
        return financasRepository.save(user);
    }

}

