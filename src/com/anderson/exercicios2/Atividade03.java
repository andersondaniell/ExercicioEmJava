package com.anderson.exercicios2;
/**Escreva um código em JAVA que cria um vetor com 5 números inteiros e calcule a soma desses 
números. */
public class Atividade03 {
    public static int[] numeros = { 1, 2, 3, 4, 5 };

    public static void main(String[] args) {
        int somaTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            somaTotal = numeros[i] + somaTotal;
        }

        System.out.println("A soma de todos os números é: " + somaTotal);
    }

}
