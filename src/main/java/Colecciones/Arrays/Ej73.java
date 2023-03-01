package Colecciones.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej73 {
    public static void main(String[] args) {
//        Sort a given array of distinct integers where all its numbers are sorted except two numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que tendrá el array: ");
        int numeros = input.nextInt();
        int[] array = new int[numeros];
        System.out.println("Introduce un numero: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();

        Arrays.sort(array);
        System.out.println("Resultado: " + Arrays.toString(array));

    }
}
