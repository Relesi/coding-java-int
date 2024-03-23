package com.coding.java.intr.OO;

// Herança: É possível herdar caracteristicas de outra classe(atributos e metodos)
public class CarroTurbinado extends Carro {

    private boolean turbo;

    public CarroTurbinado(String marca, String modelo, boolean turbo) {
        super(marca, modelo);
        this.turbo = turbo;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }


}
