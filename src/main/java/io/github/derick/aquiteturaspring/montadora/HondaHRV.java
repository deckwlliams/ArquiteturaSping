package io.github.derick.aquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("Honda");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }
}
