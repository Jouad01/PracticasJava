package Colecciones.Strings;

import java.util.Scanner;

public class Ej112 {
    public static void main(String[] args) {
//        Input the first string: Java
//        Input the second string: Ja
//        Check first string contains letters from the second string:true
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase: ");
        String palabra = input.nextLine();
        System.out.println("Introduce las letras que quieres buscar: ");
        String letras = input.nextLine();
        input.close();
        boolean resultado = false;
        for (int i = 0; i < letras.length(); i++) {
            for (int j = 0; j < palabra.length(); j++) {
                if (letras.charAt(i) == palabra.charAt(j)) {
                    resultado = true;
                    break;
                }
            }
        }
        System.out.println("El resultado es: " + resultado);

    }
}
