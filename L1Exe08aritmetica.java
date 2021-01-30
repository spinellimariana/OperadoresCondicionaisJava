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

public class L1Exe08aritmetica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, n3, n4, media;
        int CONST = 4;

        System.out.println("**MÉDIA ARITMÉTICA**");
        System.out.print("Digite o valor de n1: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite o valor de n2: ");
        n2 = teclado.nextFloat();
        System.out.print("Digite o valor de n3: ");
        n3 = teclado.nextFloat();
        System.out.print("Digite o valor de n4: ");
        n4 = teclado.nextFloat();

        media = (n1 * n2 * n3 * n4) / CONST;

        System.out.printf("A média aritmética dos 4 números é de: %.2f. \n", media);

    }
}
