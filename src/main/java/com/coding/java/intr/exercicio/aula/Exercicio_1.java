package com.coding.java.intr.exercicio.aula;

/*
        1-Escreva um programa Java para imprimir o resultado das seguintes operações.
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Saída Esperada:
        43
        1
        19
        13

        Fazer um teste unitario para a classe

 */

public class Exercicio_1 {
    public static void main(String[] args) {
        int op1 = -5 + 8 * 6;
        System.out.println("O resultado op1, é: " + op1);

        int op2 = (55+9) % 9;
        System.out.println("O resultado op1, é: " + op2);

        int op3 = 20 + -3*5 / 8;
        System.out.println("O resultado op1, é: " + op3);

        int op4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("O resultado op1, é: " + op4);
    }
}
