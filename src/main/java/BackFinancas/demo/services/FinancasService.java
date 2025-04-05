package BackFinancas.demo.services;

import BackFinancas.demo.repository.FinancasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User autenticarUsuario(String nome, String senha) {
        // Busca o usuário pelo nome
        Optional<User> usuario = financasRepository.findByNome(nome);

        if (usuario.isPresent()) {
            // Verifica se a senha fornecida corresponde ao hash no banco de dados
            if (passwordEncoder.matches(senha, usuario.get().getSenha())) {
                return usuario.get(); // Login bem-sucedido
            } else {
                throw new RuntimeException("Senha inválida!");
            }
        } else {
            throw new RuntimeException("Usuário não encontrado!");
        }
    }


}

