package com.anderson.exercicios2;
/**Escreva um código em JAVA que cria uma função que recebe um vetor de números inteiros 
como parâmetro e retorna a média dos valores contidos no vetor */
public class Atividade10 {

    public static double[] numeros = { 10, 9, 8, 10};

    public static void main(String[] args) {

        mediaDosNumeros(numeros);
    }

    public static void mediaDosNumeros(double[] numeros) {
        double valorTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            valorTotal += numeros[i];

        }
        double media = valorTotal / numeros.length;
        System.out.println("A média dos números é: " + media);
    }
}
