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

public class L1Exe03somaQuad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, soma, p1, p2;
        int QUADRADO = 2;

        System.out.println("**SOMA DOS QUADRADOS**");
        System.out.print("Digite o valor de n1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite o valor de n2: ");
        n2 = teclado.nextDouble();

        p1 =  (double)Math.pow(n1, QUADRADO);
        p2 = (double) Math.pow(n2, QUADRADO);  //não precisa desse cast mesma coisa do exercício anterior.
        soma = p1 + p2;

        System.out.printf("A soma dos quadrados de n1 e n2 é de: %.2f. \n", soma);
    }

}
