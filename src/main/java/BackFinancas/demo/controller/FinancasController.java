package BackFinancas.demo.controller;

import BackFinancas.demo.DTO.LoginRequest;
import BackFinancas.demo.domain.user.User;
import BackFinancas.demo.services.FinancasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/financas")
public class FinancasController {

    @Autowired
    private FinancasService financasService;


    // Endpoint para criar um novo User
    @PostMapping(value = "/cadastrar")
    public String criarUsuario(@RequestBody User user) {
        return "";
    }
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        return "";
    }


}