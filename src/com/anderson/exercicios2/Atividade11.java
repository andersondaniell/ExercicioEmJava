package com.anderson.exercicios2;
/**. Escreva um código em JAVA que cria um vetor com 10 números inteiros e imprime apenas os 
números ímpares utilizando um loop for. */
public class Atividade11 {
    public static int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    public static void main(String[] args) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.println(numeros[i] + " É Ímpar");

            }

        }
    }
}
