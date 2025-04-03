package BackFinancas.demo.controller;

import BackFinancas.demo.domain.User;
import BackFinancas.demo.services.FinancasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cadastrar")
public class FinancasController {

    @Autowired
    private FinancasService financasService;


    @PostMapping
    public String cadastrar(@RequestBody User user){
        return "cadastrado com sucesso";
    }

}