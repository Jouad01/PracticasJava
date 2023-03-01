package Colecciones.Arrays;

import java.util.Scanner;

public class Ej72 {
    public static void main(String[] args) {
             //  Example:
            // Input : nums1 = {1, 2, 3, 0, 4, 6}
            // Output: Continuous subarray: 1 2 3 0
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce la cantidad de numeros del array: ");
            int numero= input.nextInt();
            int[] array = new int[numero];
            System.out.println("Introduce los elementos del array: ");
            for (int i = 0; i < numero; i++) {
                array[i] = input.nextInt();
            }
            input.close();

//            variable start para almacenar el índice del primer elemento de la subarray
//            variable end para almacenar el índice del último elemento de la subarray
            int start = -1, end = -1;

            // bucle for para encontrar el primer elemento de la subarray
            for (int i = 0; i < numero- 1; i++) {
                if (array[i] > array[i + 1]) {
                    start = i;
                    break;
                }
            }

            // si el array ya está ordenado entonces no hay
            if (start == -1) {
                System.out.println("El array ya está ordenado");
                return;
            }

            // bucle for para encontrar el último elemento de la subarray
            for (int i = numero - 1; i > 0; i--) {
                if (array[i] < array[i - 1]) {
                    end = i;
                    break;
                }
            }

            // buscar el máximo y el mínimo en la subarray
            int max = array[start], min = array[start];
            for (int i = start; i <= end; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }

            // bucle para extender la subarray hacia la izquierda
            for (int i = 0; i < start; i++) {
                if (array[i] > min) {
                    start = i;
                    break;
                }
            }

            // bucle para extender la subarray hacia la derecha
            for (int i = numero - 1; i > end; i--) {
                if (array[i] < max) {
                    end = i;
                    break;
                }
            }

            System.out.println("Subarray continuo:");
            for (int i = start; i <= end; i++) {
                System.out.print(array[i] + " ");
            }
        }
}
