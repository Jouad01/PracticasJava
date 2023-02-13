package edu.daw.Practica1;

import java.util.Scanner;

public class Ejercicio1 {
        public static Scanner input = new Scanner(System.in);

//        Metodo 1
        public static void leerNumeros() {
//                int[] significa que es un array de enteros
                int[] numeros = new int[5];
                for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Introduce un número: ");
                        numeros[i] = input.nextInt();
                }
                input.nextLine();
                System.out.println("Los números introducidos son: ");
                for (int i = 0; i < numeros.length; i++) {
                        System.out.println(numeros[i] + " ");
                }

        }

//        Metodo 2
        public static void leerNumerosInversos() {
                int[] numerosInversos = new int[5];
                for (int i = 0; i < numerosInversos.length; i++) {
                        System.out.println("Introduce un número: ");
                        numerosInversos[i] = input.nextInt();
                }
                input.nextLine();
                System.out.println("Los números introducidos en orden inverso son: ");
                for (int i = numerosInversos.length - 1; i >= 0; i--) {
                        System.out.println(numerosInversos[i] + " ");
                }
        }

//        Metodo 3
        public static void calcularMedia() {
                int[] media = new int[5];
                int sumaPositivos = 0;
                int sumaNegativos = 0;
                int totalCeros = 0;
                for (int i = 0; i < media.length; i++) {
                        System.out.println("Introduce un número: ");
                        media[i] = input.nextInt();
                        if (media[i] > 0) {
                                sumaPositivos = sumaPositivos + media[i];
                        } else if (media[i] < 0) {
                                sumaNegativos = sumaNegativos + media[i];
                        } else {
                                totalCeros++;
                        }
                }
                input.nextLine();
                System.out.println("La media de los números positivos es: " + sumaPositivos / media.length);
                System.out.println("La media de los números negativos es: " + sumaNegativos / media.length);
                System.out.println("El total de ceros es: " + totalCeros);

        }

//        Metodo 4
        public static void caracteresTexto(String texto) {
                int contar = texto.length();
                System.out.println("El texto tiene " + contar + " caracteres");
        }
//        Metodo 5

        public static void textoInvertido(String texto) {
                StringBuilder textoInvertido = new StringBuilder();
                for (int i = texto.length() - 1; i >= 0; i--) {
                        textoInvertido.append(texto.charAt(i));
                }

                System.out.println(textoInvertido);
        }

//        Metodo 6
        public static void textoSinEspacios(String texto) {
                String textoSinEspacios = texto.replace(" ", "");
                System.out.println(textoSinEspacios);
        }

//        Metodo 7
        public static void concatenarCadenas(String cadena1, String cadena2) {
                String concatenarCadenas = cadena1.concat(cadena2);
                System.out.println(concatenarCadenas);
        }

//        Metodo 8
        public static void sustituirVocales(String cadena, char caracter) {
                String vocales = "aeiou";
                if (vocales.contains(String.valueOf(caracter))) {
                        String cadenaSustituida = cadena.replace("a", String.valueOf(caracter));
                        cadenaSustituida = cadenaSustituida.replace("e", String.valueOf(caracter));
                        cadenaSustituida = cadenaSustituida.replace("i", String.valueOf(caracter));
                        cadenaSustituida = cadenaSustituida.replace("o", String.valueOf(caracter));
                        cadenaSustituida = cadenaSustituida.replace("u", String.valueOf(caracter));
                        System.out.println(cadenaSustituida);
                }
        }



//        Metodo 9

        public static void codigoAscii(String cadena) {
                for (int i = 0; i < cadena.length(); i++) {
                        System.out.println(cadena.charAt(i) + " = " + (int) cadena.charAt(i));
                }
        }

//      Ejecucion metodos
        public static void main(String[] args) {
                int opcion;

                do {
                        System.out.println("\nMENÚ: ");
                        System.out.println("\n1. Introduce 5 numeros para mostrarlos en orden");
                        System.out.println("2. Introduce 5 numeros para mostrarlos en orden inverso");
                        System.out.println("3. Introduce 5 numeros para calcular la media de los positivos, negativos y ceros");
                        System.out.println("4. Introduce una frase para contar los caracteres");
                        System.out.println("5. Introduce una frase para mostrarla al reves");
                        System.out.println("6. Introduce una frase para mostrarla sin espacios");
                        System.out.println("7. Introduce dos cadenas para concatenarlas");
                        System.out.println("8. Introduce una cadena y un caracter para sustituir las vocales por el caracter");
                        System.out.println("9. Introduce una cadena para mostrar su codigo ASCII");

                        System.out.print("\nElige el método que quieres ejecutar: ");
                        opcion = input.nextInt();


                        switch (opcion) {
                                case 1:
                                        leerNumeros();
                                        break;
                                case 2:
                                        leerNumerosInversos();
                                        break;
                                case 3:
                                        calcularMedia();
                                        break;
                                case 4:
                                        Scanner metodo4 = new Scanner(System.in);
                                        System.out.print("Introduce una frase: ");
                                        String texto = metodo4.nextLine();
                                        caracteresTexto(texto);
                                        break;
                                case 5:
                                        Scanner metodo5 = new Scanner(System.in);
                                        System.out.print("Introduce una frase: ");
                                        String texto2 = metodo5.nextLine();
                                        System.out.print("Tu frase al reves es: ");
                                        textoInvertido(texto2);
                                        break;
                                case 6:
                                        Scanner metodo6 = new Scanner(System.in);
                                        System.out.print("Introduce una frase: ");
                                        String texto3 = metodo6.nextLine();
                                        System.out.print("Tu frase sin espacios es: ");
                                        textoSinEspacios(texto3);
                                        break;
                                case 7:
                                        Scanner metodo7 = new Scanner(System.in);
                                        System.out.print("Introduce una frase: ");
                                        String cadena1 = metodo7.nextLine();
                                        System.out.print("Introduce otra frase: ");
                                        String cadena2 = metodo7.nextLine();
                                        System.out.print("Aqui tienes las frases concatenadas: ");
                                        concatenarCadenas(cadena1, cadena2);
                                        break;
                                case 8:
                                        Scanner metodo8 = new Scanner(System.in);
                                        System.out.print("Introduce una frase: ");
                                        String cadena = metodo8.nextLine();
                                        System.out.print("Introduce un caracter: ");
                                        char caracter = metodo8.next().charAt(0);
                                        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                                                System.out.print("La frase con la vocal sustituida es la siguiente: ");
                                        } else {
                                                System.out.print("\nEsa no es una vocal");
                                        }
                                        sustituirVocales(cadena, caracter);
                                        break;
                                case 9:
                                        Scanner metodo9 = new Scanner(System.in);
                                        System.out.print("Introduce una frase: ");
                                        String cadena3 = metodo9.nextLine();
                                        System.out.println("Este es tu codigo Ascii: ");
                                        codigoAscii(cadena3);
                                        break;
                                default:
                                        System.out.print("Opción incorrecta");
                                        break;
                        }
                } while (opcion != 9);
                        input.close();
        }

}
