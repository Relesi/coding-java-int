package com.coding.java.intr.estrutura;

public class EstruturaCondicionalFor {
    public static void main(String[] args) {
        double valorTotal = 3000;

        for(int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if (valorTotal < 1000) {
                continue;
            }
            System.out.println("Parcela autorizada" + parcela + "R$" + valorParcela);
        }


    }
}
