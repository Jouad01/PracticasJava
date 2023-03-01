package Colecciones.Strings;

import java.util.Scanner;

public class Ej109 {
    public static void main(String[] args) {
//        Write a Java program that reverses all the words in a string that have odd lengths
//        Original text: Check two consecutive identical letters in a given string
//        Reverses the words in the string that have odd lengths:
//        Check two consecutive identical letters ni a given gnirts
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        String[] palabras = frase.split(" ");
        String resultado = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() % 2 != 0) {
                resultado = resultado + palabras[i] + " ";
            } else {
                String palabraInvertida = "";
//                se recorre la palabra de derecha a izquierda para invertirla y se guarda en la variable palabraInvertida
                for (int j = palabras[i].length() - 1; j >= 0; j--) {
                    palabraInvertida = palabraInvertida + palabras[i].charAt(j);

                }
                resultado = resultado + palabraInvertida + " ";
            }

        }
        System.out.println(resultado);
    }
}
