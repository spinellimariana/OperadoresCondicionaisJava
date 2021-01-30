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

public class L1Exe11negativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("**POSITIVO OU NEGATIVO**");
        System.out.print("Digite um número qualquer: ");
        float n1 = teclado.nextFloat();

        if (n1 < 0) {
            System.out.println("Número negativo.");
        }else{
            System.out.println("Número positivo.");
        }

    }
}
