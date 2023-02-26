package edu.daw.Lote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        numFactorial();
        numPotencia();
        mediaAritmetica();
        maximoComunDivisor();
        numCombinaciones(3, 6);
        numPrimo();
        numOcurrencias();
        numPalindromo();
    }

//    factorial = multiplicar todos los numeros anteriores.
//    ej: 5 = 1x2x3x4x5 -> 120
    public static void numFactorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = input.nextInt();
        input.close();
        int factorial = 1;
//        hasta que llegue al num se incrementa
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es " + factorial);
    }



    public static int numPotencia() {
//        (Sin usar pow)
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = input.nextInt();
        System.out.println("Ahora pon el numero por el cual se eleva (Ej: 3 -> 3^3: ");
        int potencia = input.nextInt();
        input.close();
        int resultado = 1;
        if (num > 0 && potencia == 0) {
            return resultado;
        } else if (num == 0 && potencia >= 1) {
            return 0;
        }else {
//            este bucle se va incrementando hasta que llegue al numero de la potencia.
//            mientras resultado se va multiplicando. ej: 1*3, 3*3, 9*3...
            for(int i = 1; i <= potencia; i++) {
                resultado = resultado * num;
            }
            System.out.println("La potencia de tu numero entero " + num + " es " + resultado);
        }
        return num;
    }



    public static void mediaAritmetica() {
        int[] numeros = {2, 3, 4, 7, 10};
//        Arrays.toString permite imprimir la array
        System.out.println("Los numeros son: " + Arrays.toString(numeros));
//        creamos una variable media para ir sumando los numeros de la array
        float media = 0;
//        este bucle recorre la array y va sumando los numeros para luego dividirlos entre la longitud de la array
        for (int i = 0; i<numeros.length; i++){
            media = media + numeros[i];
        }
//        la variable media se divide entre la longitud de la array
        media = media / numeros.length;
        System.out.println("La media aritmetica es: " + media);
    }




    public static void maximoComunDivisor() {
        //    calcular el maximo comun divisor
        int num1 = 16;
        int num2 = 24;
        int maximoComunDivisor = 0;
        //    este bucle recorre desde 1 hasta el numero mas pequeño de los dos numeros introducidos
        //    y si el resto de la division de ambos numeros es 0, se guarda en la variable maximoComunDivisor
        for (int i = 1; i <= num1; i++){
            if(num1 % i == 0 && num2 % i == 0) {
                maximoComunDivisor = i;
            }
        }
        System.out.println("El maximo comun divisor de " + num1 + " y " + num2 + " es " + maximoComunDivisor);
    }



    public static int numCombinaciones(int n, int k) {
        if (k > n) {
            return 0;
        }
        int numerador = 1;
        int denominador = 1;
        for (int i = 0; i < k; i++) {
            numerador *= n - i;
            denominador *= i + 1;
        }
        return numerador / denominador;
    }

    public static void numPrimo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = input.nextInt();
        input.close();
        int cont = 0;
        for (int i = 2; i <= num; i++) {
            if (i % 2 != 0) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " numeros primos entre 2 y " + num);
    }



    public static void numOcurrencias(){
        Scanner input = new Scanner(System.in);
        List <Integer> numerosLista = new ArrayList <>();
        System.out.println("Introduce numeros para la lista. Para terminar, introduce uno negativo: ");
        int num = input.nextInt();
        while (num >= 0) {
            numerosLista.add(num);
            num = input.nextInt();
        }
        System.out.print("Introduce el valor que quieres contar: ");
        int valor = input.nextInt();
        int cont = 0;
        for (Integer integer : numerosLista) {
            if (integer == valor) {
                cont++;
            }
        }
        System.out.println("El numero de ocurrencias de " + valor + " es " + cont + " veces.");
    }




    public static void numPalindromo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es palindromo: ");
        int num = input.nextInt();
        input.close();
        int numInvertido = 0;
        int numOriginal = num;
    //                este bucle se va ejecutando mientras el numero sea mayor que 0
        while (num > 0) {
    //                        resto es el numero que queda al dividir el numero entre 10 para saber el ultimo digito
            int resto = num % 10;
    //                        numInvertido se va multiplicando por 10 y se le suma el resto para ir guardando el numero invertido
            numInvertido = numInvertido * 10 + resto;
    //                        num se divide entre 10 para ir quitando el ultimo digito
            num = num / 10;
        }
    //                si el numero original es igual al numero invertido es palindromo
        if (numOriginal == numInvertido) {
            System.out.println("El numero " + numOriginal + " es palindromo.");
        } else {
            System.out.println("El numero " + numOriginal + " no es palindromo.");
        }
    }
}
