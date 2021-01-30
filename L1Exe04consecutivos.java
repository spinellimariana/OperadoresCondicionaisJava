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

public class L1Exe04consecutivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, c1, c2, CONST = 1;
        
        System.out.println("**NÚMEROS CONSECUTIVOS**");
        System.out.print("Digite o valor de n1: ");
        n1 = teclado.nextInt();
        System.out.print("Digite o valor de n2: ");
        n2 = teclado.nextInt();

        c1 = n1 + CONST;
        c2 = n2 + CONST;

        System.out.println("O consecutivo de n1 é: " + c1 + ".");
        System.out.println("O consecutivo de n2 é: " + c2 + ".");

    }
}