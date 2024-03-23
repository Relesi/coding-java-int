package com.coding.java.intr.OO;

// Polimorfismo: objetos de diferentes classes podem ser tratados se pertencer a mesma hierarquia de classe.
public class Revendedora {

    public void venderCarro(Carro carro) {
        System.out.println("Vendido: " + carro.getMarca() + "" + carro.getModelo());
    }
}
