package io.github.derick.aquiteturaspring.montadora;

public class Motor {

    private String modelo;
    private Integer cavalo;
    private Integer cilindro;
    private double litragem;
    private TipoMotor tipo;

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavalo=" + cavalo +
                ", cilindro=" + cilindro +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavalo() {
        return cavalo;
    }

    public void setCavalo(Integer cavalo) {
        this.cavalo = cavalo;
    }

    public Integer getCilindro() {
        return cilindro;
    }

    public void setCilindro(Integer cilindro) {
        this.cilindro = cilindro;
    }

    public double getLitragem() {
        return litragem;
    }

    public void setLitragem(double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
