package BackFinancas.demo.controller;

import BackFinancas.demo.DTO.LoginRequest;
import BackFinancas.demo.domain.User;
import BackFinancas.demo.services.FinancasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/financas")
public class FinancasController {

    @Autowired
    private FinancasService financasService;


    // Endpoint para criar um novo User
    @PostMapping(value = "/cadastrar")
    public ResponseEntity<User> criarUsuario(@RequestBody User user) {
        User userSalvo = financasService.criarOuRetornarUsuario(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userSalvo);
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        try {
            // Chama o serviço para autenticar o usuário
            User usuarioLogado = financasService.autenticarUsuario(loginRequest.getNome(), loginRequest.getSenha());
            return ResponseEntity.ok(usuarioLogado); // Retorna o usuário logado
        } catch (RuntimeException e) {
            // Credenciais inválidas
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }


}