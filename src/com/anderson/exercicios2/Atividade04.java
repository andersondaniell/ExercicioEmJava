package com.anderson.exercicios2;
/**Escreva um código em JAVA que verifica se um número é divisível por 3 e 5 ao mesmo tempo 
utilizando operadores lógicos e imprime o resultado. */ 

public class Atividade04 {

    public static int divisivelTres = 3;
    public static int divisivelCinco = 5;
    public static int numero = 15;

    public static void main(String[] args) {

        double resultPorTres = 0;
        double resultPorCinco = 0;
        resultPorTres = numero / divisivelTres;
        resultPorCinco = numero / divisivelCinco;

        if (numero % divisivelTres == 0 && numero % divisivelCinco == 0) {
            System.out.println("O número " + numero + " é divisivel por tres e cinco");
            System.out.println("divisivel por tres " + numero + "/" + divisivelTres + " Resultado: " + (resultPorTres)
                    + "\n" +
                    "divisivel por cinco: " + numero + "/" + divisivelCinco + " Resultado: " + (resultPorCinco));

        }

    }

}
