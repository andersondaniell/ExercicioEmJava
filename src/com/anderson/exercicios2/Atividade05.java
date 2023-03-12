package com.anderson.exercicios2;
/**Escreva um código em JAVA que cria um vetor com os nomes de 5 países e imprime cada nome 
em uma linha separada utilizando um loop foreach. */
public class Atividade05 {
    public static String[] paises = { "Brasil", "Argentina", "Uruguai", "Paraguai", "Belgica" };

    public static void main(String[] args) {
        for (String pais : paises) {
            System.out.println(pais);

        }
    }
}
