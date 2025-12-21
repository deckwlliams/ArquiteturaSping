package io.github.derick.aquiteturaspring.montadora.configuraion;

import io.github.derick.aquiteturaspring.montadora.Motor;
import io.github.derick.aquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalo(120);
        motor.setCilindro(30);
        motor.setModelo("Honda");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

}
