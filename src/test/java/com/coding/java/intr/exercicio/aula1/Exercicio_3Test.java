package com.coding.java.intr.exercicio.aula1;

import com.coding.java.intr.exercicio.aula.Exercicio_3;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Exercicio_3Test {

    @Test
    public void testVerificarParidade() {
        assertEquals(1, Exercicio_3.verificarParidade(4));
        assertEquals(0, Exercicio_3.verificarParidade(7));
        assertEquals(1, Exercicio_3.verificarParidade(0));
        assertEquals(1, Exercicio_3.verificarParidade(-2));
    }

    @Test
    public void testVerificarParidadeWithEvenNumber() {
        // Simula a entrada do usuário com um número par
        provideInput("4");

        // Captura a saída do console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Executa o método
        Exercicio_3.main(new String[]{});

        // Restaura a entrada/saída padrão
        System.setIn(System.in);
        System.setOut(System.out);

        // Converte a saída capturada em uma string e verifica se é o esperado
        assertEquals("Digite um numero:\n1\n", outputStream.toString());
    }

    @Test
    public void testVerificarParidadeWithOddNumber() {
        // Simula a entrada do usuário com um número ímpar
        provideInput("7");

        // Captura a saída do console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Executa o método
        Exercicio_3.main(new String[]{});

        // Restaura a entrada/saída padrão
        System.setIn(System.in);
        System.setOut(System.out);

        // Converte a saída capturada em uma string e verifica se é o esperado
        assertEquals("Digite um numero:\n0\n", outputStream.toString());
    }

    private void provideInput(String data) {
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputStream);
    }
}