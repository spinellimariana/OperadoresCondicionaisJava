package Lista1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class L1Exe01multiplica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float n1, n2, produto;

        System.out.println("**MULTIPLICAÇÃO DE DOIS NÚMEROS**");
        System.out.print("Digite o valor de n1: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite o valor de n2: ");
        n2 = teclado.nextFloat();

        produto = n1 * n2;

        System.out.printf("O produto é: %.2f. \n", produto);
    }
}
