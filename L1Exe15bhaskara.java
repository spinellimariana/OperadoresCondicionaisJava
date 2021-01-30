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

public class L1Exe15bhaskara {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, x1, x2, delta;

        System.out.println("**RESOLVENDO BHASKARA**");
        do {
            System.out.print("Digite o valor de A: ");
            a = teclado.nextDouble();
            if (a == 0) {
                System.out.println("Opção inválida. Para uma equação de 2o grau existir o valor de 'a' não pode ser zero:");
            }
        } while (a != 0);
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0 || a == 0) {
            System.out.println("Impossível calcular");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println();
            System.out.println("As raízes de Bhaskara são: ");
            System.out.printf("R1 = %.2f. \n", x1);
            System.out.printf("R2 = %.2f. \n", x2);
        }
    }
}
