package BackFinancas.demo.services;

import BackFinancas.demo.repository.FinancasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import BackFinancas.demo.domain.User;

import java.util.Optional;

@Service
public class FinancasService {

    @Autowired
    private FinancasRepository financasRepository;

    public User criarOuRetornarUsuario(User novoUsuario) {

        Optional<User> usuarioExistente = financasRepository.findByNome(novoUsuario.getNome());

        if (usuarioExistente.isPresent()) {
            return usuarioExistente.get();
        }

        return financasRepository.save(novoUsuario);
    }

    }

