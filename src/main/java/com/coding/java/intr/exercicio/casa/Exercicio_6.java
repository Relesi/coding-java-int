package com.coding.java.intr.exercicio.casa;

import java.util.Scanner;

    /*

    - Escreva um programa Java para contar as letras, espaços, números e outros caracteres
        de uma string de entrada.
        Saída Esperada:
        A string é: A realidade é meramente uma ilusão, embora muito persistente – (Albert
        Einstein)
        letra: 65
        espaço: 11
        número: 8
        outro: 4
     */

public class Exercicio_6 {


    public static void contarCaracteres(String texto) {
        int letras = 0;
        int espacos = 0;
        int numeros = 0;
        int outros = 0;

        // Iterando sobre cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            // Verificando o tipo de caractere
            if (Character.isLetter(caractere)) {
                letras++;
            } else if (Character.isDigit(caractere)) {
                numeros++;
            } else if (Character.isSpaceChar(caractere)) {
                espacos++;
            } else {
                outros++;
            }
        }

        // Imprimindo os resultados formatados conforme especificado
        System.out.println("letra: " + letras);
        System.out.println("espaço: " + espacos);
        System.out.println("número: " + numeros);
        System.out.println("outro: " + outros);
    }

    public static void main(String[] args) {
        String texto = "A realidade é meramente uma ilusão, embora muito persistente – (Albert Einstein)";
        contarCaracteres(texto);
    }


}

