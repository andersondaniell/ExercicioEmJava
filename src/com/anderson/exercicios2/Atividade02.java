package com.anderson.exercicios2;

/** Escreva um código em JAVA que verifica se um número é par ou ímpar e imprime o resultado. */
public class Atividade02 {
    public static int numero = 8;

    public static void main(String[] args) {
        validaParOuImpar(numero);
    }

    public static void validaParOuImpar(int numero) {
        System.out.println(numero % 2 == 0 ? "É par" : "É impar");
    }
}
