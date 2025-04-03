package BackFinancas.demo.services;

import org.springframework.stereotype.Service;

@Service
public class FinancasService {

    public String helloWorld(String name) {
        return "Hello World!" + " " + name;
    }
    public String login (String usuario, String senha) {
       return "Usuario: " + usuario + " Senha: " + senha;
    }
}

