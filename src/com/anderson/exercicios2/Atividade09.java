package com.anderson.exercicios2;
/**Escreva um código em JAVA que cria um vetor com os números de 1 a 20 e imprime apenas os 
números pares utilizando um loop for.
 */
public class Atividade09 {
    public static int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

    public static void main(String[] args) {

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Esse número é par: " + numeros[i]);

            }

        }
    }

}
