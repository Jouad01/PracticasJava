package Colecciones.Strings;

import java.util.Scanner;

public class Ej108 {
    public static void main(String[] args) {
//        Original word: Follow
//        If there are two consecutive identical letters in the said string: true
//        Original word: Java
//        If there are two consecutive identical letters in the said string: false

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = input.nextLine();
        input.close();
        boolean isRepeat = false;
        int contador = 0;
        for (int i = 0; i < palabra.length() - 1; i++ ) {
            if (palabra.charAt(i) == palabra.charAt(i + 1)) {
                isRepeat = true;
                contador++;
            }
        }
        if (isRepeat) {
            System.out.println("La palabra " + palabra + " tiene letras dobles por lo que es " + isRepeat);
        } else {
            System.out.println("La palabra " + palabra + " no tiene letras dobles por lo que es: " + isRepeat);
        }
    }
}
