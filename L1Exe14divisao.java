package Lista1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class L1Exe14divisao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, div;

        System.out.println("**DIVISÃO DO MAIOR PELO MENOR**");
        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();

        if (a > b) {
            div = a / b;
            System.out.printf("A divisão de A por B é igual a: %.2f. \n", div);
        } else {
            div = b / a;
            System.out.printf("A divisão de B por A é igual a: %.2f. \n", div);
        }

    }

}
