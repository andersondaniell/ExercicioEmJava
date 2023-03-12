package com.anderson.exercicios2;
/**Escreva um código em JAVA que recebe três números (a, b e c) como entrada e calcula as raízes 
da equação quadrática utilizando a fórmula de Bhaskara.*/
import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("insira o valor de a ");
        a = scan.nextDouble();
        System.out.println("Insira o valor de b ");
        b = scan.nextDouble();
        System.out.println("Insira o valor de c ");
        c = scan.nextDouble();
        scan.close();
        calculaBaskara(a, b, c);
    }

    private static void calculaBaskara(double a, double b, double c) {

        double delta = Math.pow(b, 2) - 4 * (a * c);
        System.out.println("O resuldado da equação quadratica é igual a:" + delta);

    }

}
