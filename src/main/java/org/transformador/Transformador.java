package org.transformador;

import java.util.*;

public class Transformador {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hola", "como", "estas?");
        FuncionString toUpperCase = str -> str.toUpperCase();
//        FuncionString toUpperCase = String::toUpperCase;
        procesarStrings(strings, toUpperCase);
    }

    public static void procesarStrings(List<String> strings, FuncionString funcion) {
        for (String str : strings) {
            String result = funcion.funcionString(str);
            System.out.println(result);
        }
    }
}