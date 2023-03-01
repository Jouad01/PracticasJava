package Colecciones.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej71 {
    public static void main(String[] args) {
//        Example:
//        Input: nums = {1, 2, 3, 0, 4, 6}
//        Output: Largest number using the said array numbers: 643210
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que tendrá el array: ");
        int numeros = input.nextInt();
        int[] array = new int[numeros];
        System.out.println("Introduce el numero: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        int[] numerosOrdenados = new int[numeros];
        for (int i = 0; i < numeros; i++) {
//            ordena de forma descendente
            numerosOrdenados[i] = array[numeros - i - 1];
        }
        System.out.println("Numeros ordenados de mayor a menor: " + Arrays.toString(numerosOrdenados));
    }
}
