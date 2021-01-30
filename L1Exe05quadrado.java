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

public class L1Exe05quadrado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float lado, area;

        System.out.println("**ÁREA DO QUADRADO**");
        System.out.print("Digite o lado do seu quadrado: ");
        lado = teclado.nextFloat();
        area = lado * lado;

        System.out.printf("A área do seu quadrado é: %.2f. \n", area);

    }
}
