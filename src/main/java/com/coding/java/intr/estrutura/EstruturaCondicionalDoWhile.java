package com.coding.java.intr.estrutura;

public class EstruturaCondicionalDoWhile {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        count = 0;

        do {
            System.out.println("Dentro do while" + ++count);
        }while (count> 10);
    }
}
