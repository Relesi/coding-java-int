package com.coding.java.intr.exercicio.aula1;

import com.coding.java.intr.exercicio.aula.Exercicio_1;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercicio_1Test {
    @Test
    public void testMethod() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Exercicio_1.main(new String[]{});
        System.setOut(System.out);

        String output = outputStream.toString().trim();

        assertTrue(output.contains("O resultado op1, é: 43"));
//        assertTrue(output.contains("O resultado da op2: 1"));
//        assertTrue(output.contains("O resultado da op3: 19"));
//        assertTrue(output.contains("O resultado da op4: 13"));


    }
}
