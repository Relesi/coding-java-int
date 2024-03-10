package com.coding.java.intr.operadores;

public class OpLogico {
    public static void main(String[] args) {
        double contaCorrente = 200;
        double contaPoupanca = 3000;

        float valorMotocicleta = 20000;

        boolean motocicleta = contaCorrente > valorMotocicleta && contaPoupanca > valorMotocicleta;

        System.out.println(motocicleta);

    }

}
