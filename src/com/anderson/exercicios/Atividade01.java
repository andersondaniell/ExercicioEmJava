package com.anderson.exercicios;

/** Escreva um código em JAVA que calcula a média de três números e imprime o resultado */
public class Atividade01 {

    public static double numeroUm = 10;
    public static double numeroDois = 10;
    public static double numeroTres = 10;

    public static void main(String[] args) {
        calculaMedia(numeroUm, numeroDois, numeroTres);
    }

    public static void calculaMedia(double numeroUm, double numeroDois, double numeroTres){
        double result = (numeroUm + numeroDois + numeroTres)/3;
        System.out.println("O resultado da média de 3 números é igual: \n " + result);
        System.out.printf("O resultado da média de 3 números é igual: \n %s", result);
    }
}