package edu.daw.MiscelaneaEjercicios;

import java.util.Random;

public class ArrayTranspuesta {
    //    Ej: a = [1,2,3
//                 4,5,6
//                 7,8,9]
//            a2 = [1,4,7
//                  2,5,8
//                  3,6,9]
    public static void main(String[] args) {

        Random random = new Random();
        int[][] array = new int[3][3];
        System.out.println("\nArray original 3x3");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[][] array2 = new int[3][3];

        for (int a = 0; a < 3; a++)
            for (int b = 0; b < 3; b++)
                array2[b][a] = array[a][b];

                System.out.println("\nArray transpuesta 3x3");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++)
                        System.out.print(array2[i][j] + " ");
                        System.out.println();
                    }
        }
}
