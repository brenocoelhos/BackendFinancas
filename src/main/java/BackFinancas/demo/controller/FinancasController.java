package BackFinancas.demo.controller;

import BackFinancas.demo.domain.User;
import BackFinancas.demo.services.FinancasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cadastrar")
public class FinancasController {

    @Autowired
    private FinancasService financasService;


    // Endpoint para criar um novo User
    @PostMapping
    public ResponseEntity<User> criarUsuario(@RequestBody User user) {
        User userSalvo = financasService.criarOuRetornarUsuario(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userSalvo);
    }

}