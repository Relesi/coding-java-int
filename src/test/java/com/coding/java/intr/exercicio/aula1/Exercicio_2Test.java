package com.coding.java.intr.exercicio.aula1;

import com.coding.java.intr.exercicio.aula.Exercicio_2;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Exercicio_2Test {


    @Test
    public void testConversaoBinarioParaDecimal() {
        long numeroBinario = 101110; // Exemplo de número binário
        long numeroDecimal = Exercicio_2.converterBinarioParaDecimal(numeroBinario);

        assertEquals("Teste para conversão binário para decimal falhou", 46, numeroDecimal);
    }

    @Test
    public void testMain() {
        // Simulando a entrada do usuário com um valor binário
        String input = "101110";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Capturando a saída do System.out.println
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // Executando o método main
        Exercicio_2.main(new String[]{});

        // Restaurando as configurações padrão
        System.setIn(System.in);
        System.setOut(System.out);

        // Obtendo a saída esperada do método main
        String expectedOutput = "Insira um numero binário: Numero Decimal: 46\n";
        assertEquals(expectedOutput, out.toString());
    }

}
