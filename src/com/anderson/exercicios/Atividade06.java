package com.anderson.exercicios;
/**Escreva um código em JAVA que verifica se uma string começa com a letra "A" e termina com 
a letra "Z" e imprime o resultado */
public class Atividade06 {

    public static String palavra = "Andersonz";

    public static void main(String[] args) {
        String verifica = palavra.toUpperCase();

        if (verifica.startsWith("A") && verifica.endsWith("Z")) {

            System.out.println("A palavra: " + verifica + " começa com a letra A \n e tem também letra z");

        } else {
            System.out.println("A palavra: " + verifica + " Não tem A e Z juntas");
        }

    }

}
