package com.coding.java.intr.operadores;

public class OpTernario {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("Idade: " + status);
    }

}
