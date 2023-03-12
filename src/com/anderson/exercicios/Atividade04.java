package com.anderson.exercicios;

/* Escreva um código em JAVA que define uma chamada constante "PI" com o valor 3.14159 e 
calcula a área de um círculo com raio 5. */ 
public class Atividade04 {

    public static final double PI = 3.14159;

    public static double raio = 5;

    public static double raioaoquadrado = Math.pow(raio, 2);

    public static double area = PI * raioaoquadrado;
    public static void main(String[] args) {
        System.out.println("O resultado é " + area);

    }

}
