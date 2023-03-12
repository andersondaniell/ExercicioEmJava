package com.anderson.exercicios;

/**Escreva um código em JAVA que verifica se uma string contém a palavra "PHP" e imprime o 
resultado. */
public class Atividade03 {
    public static void main(String[] args) {
        String nomelinguagem = "aqui tem PHP";

        String verifica = nomelinguagem.toLowerCase();
        if (verifica.contains("php")) {

            System.out.println("A palavra: " + verifica + " contem php");

        } else {
            System.out.println("A palavra: " + verifica + " não contem php");

        }

    }
}
