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

public class L1Exe07hipotenusa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, hip, soma;

        System.out.println("***Hipotenusa do Triângulo***");
        System.out.print("Digite o valor de n1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite o valor de n2: ");
        n2 = teclado.nextDouble();

        soma = (n1 * n1)+ (n2 * n2);
        hip = Math.sqrt(soma);

        System.out.printf("A hipotenusa do seu triângulo é igual a %.2f. \n", hip);

    }
}
