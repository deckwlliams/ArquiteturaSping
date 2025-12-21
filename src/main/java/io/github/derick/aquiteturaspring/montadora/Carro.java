package io.github.derick.aquiteturaspring.montadora;

import java.awt.*;

public class Carro {

    private String modelo;
    private Color cor;
    private Montadora montadora;


    public CarroStatus darIgnicao(Chave chave) {
    if(chave.getMontadora() != this.montadora){
        return new CarroStatus("nao iniciou" + motor);
    }
    return new CarroStatus("Carro ligago" + motor);
    }
    public Carro(Motor motor) {
        this.motor = motor;
    }

    private Motor motor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
