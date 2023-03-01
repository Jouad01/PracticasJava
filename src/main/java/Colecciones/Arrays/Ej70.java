package Colecciones.Arrays;

import java.util.Scanner;

public class Ej70 {
    public static void main(String[] args) {
//         el programa busca la subarray de menor longitud, por lo que si existen varias subarrays de igual longitud
//         cuya suma es mayor o igual al valor mínimo especificado, entonces se toma la primera que se encuentre.
//         En el caso de la entrada [1,2,3,4,5,6] y un valor mínimo de 8,
//         la subarray de menor longitud que cumple con la condición es [3,4], cuya longitud es 2.
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el numero de elementos de que tendrá el array: ");
        int numero = input.nextInt();
        int[] array = new int[numero];
        System.out.println("Introduce un numero:");
        for (int i = 0; i < numero; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Introduce el valor mínimo de la suma: ");
        int sumaMin = input.nextInt();
        input.close();

        // Llamar al método que realiza los cálculos e imprimir resultados
        int resultado = segundoMetodo(array, sumaMin);
        if (resultado == 0) {
            System.out.println("No hay subarrays que sumen al menos " + sumaMin);
        } else {
            System.out.println("El tamaño del subarray más pequeño que suma al menos " + sumaMin + " es: " + resultado);
        }
    }

    public static int segundoMetodo(int[] array, int sumaMin) {
        int numero = array.length;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < numero; end++) {
            sum += array[end];
            while (sum >= sumaMin) {
                int length = end - start + 1;
                minLength = Math.min(minLength, length);
//      se resta el elemento en el índice start del acumulador sum y se incrementa start, se acorta
                sum -= array[start];
                start++;
            }
        }
        // si minLength es igual a Integer.MAX_VALUE, entonces no hay subarray que cumpla con la condición
        // por lo que se devuelve 0 en ese caso, de lo contrario se devuelve minLength (OPERADOR TERNARIO)
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

