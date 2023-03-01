package Colecciones.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej78 {
    public static void main(String[] args) {
        //  Example:
        // Original array of numbers: [1, -2, -5, -4, 3, -6]
        // Check Negative Dominance in the said array!true
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que tendrá el array: ");
        int numeros = input.nextInt();
        int[] array = new int[numeros];
        System.out.println("Introduce el numero: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        int contarNegativos = 0;
        int contarPositivos = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0) {
                contarNegativos++;
            } else {
                contarPositivos++;
            }
        }
        boolean resultado = contarNegativos > contarPositivos;
        if (resultado) {
            System.out.println("Mayoria negativa, es true. Aqui el resultado " + Arrays.toString(array));
        } else {
            System.out.println("No hay mayoría negativa. Aqui el resultado " + Arrays.toString(array));
        }

    }
}