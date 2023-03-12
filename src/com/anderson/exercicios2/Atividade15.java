package com.anderson.exercicios2;
/** Escreva um código em JAVA que verifica se um número é primo ou não utilizando um loop for 
e imprime o resultado.
 */
//TODO: Melhorar e finalizar o codigo6
public class Atividade15 {
    public static int numero = 15;

    public static void main(String[] args) {
        for (int i = 1; i < numero; i++) {
            if (i == 1 || i == numero) {
                calculaprimo(numero, i);
            }

        }

    }

    public static void calculaprimo(int numero, int verifica) {
        if (numero % verifica == 0) {
            System.out.println("O " + numero + " É primo");
        } else {
            System.out.println("não é primo");
        }

    }
}
