package com.anderson.exercicios;

/** Escreva um código em JAVA que verifica se um número é par ou ímpar e imprime o resultado. */
public class Atividade02 {

    public static int numero = 6;

    public static void main(String[] args) {

        validaParOuImpar(numero);
    }

    public static void validaParOuImpar(int numero) {
        int result = numero % 2;
        if (result == 0) {

            System.out.printf("O número %s é par", numero);

        } else if (result == 1)
            System.out.printf("O número %s é ímpar", numero);

    }
}
