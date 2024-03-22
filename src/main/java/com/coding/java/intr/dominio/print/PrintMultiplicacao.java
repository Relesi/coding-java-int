package com.coding.java.intr.dominio.print;

import com.coding.java.intr.dominio.Calculadora;

public class PrintMultiplicacao {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.multiplicarNumeros(20, 5);
        System.out.println(result);
        System.out.println(calculadora.multiplicarNumeros(20, 5));
    }
}
