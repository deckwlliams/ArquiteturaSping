package io.github.derick.aquiteturaspring.montadora.api;

import io.github.derick.aquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class TesteFabricaController {

    @Autowired
   private Motor motor;
    @PostMapping
public CarroStatus LigarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
       return carro.darIgnicao(chave);
    }
}
