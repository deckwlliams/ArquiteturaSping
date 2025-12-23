package io.github.derick.aquiteturaspring.montadora.configuraion;

import io.github.derick.aquiteturaspring.montadora.Motor;
import io.github.derick.aquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalo(120);
        motor.setCilindro(4);
        motor.setModelo("RPT-1");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = " motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalo(110);
        motor.setCilindro(3);
        motor.setModelo("XPTO-8");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }
    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalo(120);
        motor.setCilindro(30);
        motor.setModelo("V-8");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}
