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

public class L1Exe13maiorNum {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;

        System.out.println("**COMPARATIVO DE NÚMEROS**");
        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();

        if (a > b && a > c) {
            System.out.println("A é o maior número. A = " + a + ".");
        } else if (b > a && b > c) {
            System.out.println("B é o maior número. B = " + b + ".");
        } else{
            System.out.println("C é o maior número. C = " + c + ".");
        }
    }
}
