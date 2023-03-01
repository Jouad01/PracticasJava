package Colecciones.Arrays;

import java.util.Scanner;

public class Ej79 {
    public static void main(String[] args) {
//        Example: Original array of elements: [p, r, s, t]
//        Missing letter in the said array: q
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la cantidad de letras que tendrá el array: ");
        String letras = input.nextLine();
        int cantidadLetras = Integer.parseInt(letras);
        char[] array = new char[cantidadLetras];
        System.out.println("Introduce la letra: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.next().charAt(0);
        }
        input.close();
        char resultado = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                resultado = (char) (array[i] + 1);
                break;
            }
        }
        System.out.println("La letra que falta es: " + resultado);

    }
}
