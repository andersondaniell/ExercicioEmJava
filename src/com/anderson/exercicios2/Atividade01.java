package com.anderson.exercicios2;
/**Escreva um código em JAVA que define uma constante para armazenar o valor de Pi e calcule a 
área de um círculo com raio 5 utilizando essa constante. */
public class Atividade01 {
    public static final double PI = 3.14159;

    public static double raio = 5;

    public static double raioaoquadrado = Math.pow(raio, 2);

    public static double area = PI * raioaoquadrado;

    public static void main(String[] args) {
        System.out.println("O resultado é " + area);

    }

}
