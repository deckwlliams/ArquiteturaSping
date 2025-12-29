package io.github.derick.aquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MainSender {
     public void enviar(String mensagem){
         System.out.println(mensagem);
     }
}
