package org.transformador;

import org.apache.maven.surefire.shared.io.output.ByteArrayOutputStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.*;

public class AppTest {
    @DisplayName("Debería transformar todo a Mayúsculas ")
    @Test
    public void procesarStrings() {
        List<String> strings = Arrays.asList("hola", "como", "estas?");
        FuncionString toUpperCase = str -> str.toUpperCase();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Transformador.procesarStrings(strings, toUpperCase);

        System.setOut(System.out);

        String consoleOutput = outputStream.toString().trim();

        String expected = "HOLA\r\nCOMO\r\nESTAS?";
        assertEquals(expected, consoleOutput);
    }
}

