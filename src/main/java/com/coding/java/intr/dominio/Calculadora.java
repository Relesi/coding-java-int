package com.coding.java.intr.dominio;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 5);
    }

    public void subtrairNumeros() {
        System.out.println(10 - 5);
    }

    public double multiplicarNumeros(int n1, int n2) {
        System.out.println(n1 * n2);
        return 0;
    }

    public void dividirDoisNumeros(double n1, double n2) {
//        if (n1 == 0) {
//            System.out.println("Não pode ser por ZERO!");
//        }

        System.out.println(n1 / n2);

    }
}
