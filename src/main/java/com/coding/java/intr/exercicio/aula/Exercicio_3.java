package com.coding.java.intr.exercicio.aula;

/*
            Escreva um programa Java para converter um número binário em um número decimal.
            Dados de entrada: Insira um número binário: 100
            Saída Esperada Número Decimal: 4


 */

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int number = inputNum.nextInt();

        int resultado = verificarParidade(number);

        System.out.println(resultado);
    }

    public static int verificarParidade(int number) {
        if (number % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
