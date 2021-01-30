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

public class L1Exe17aceitos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, d, soma1, soma2;

        System.out.println("**VALORES ACEITOS OU NÃO ACEITOS**");
        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();
        System.out.print("Digite o valor de D: ");
        d = teclado.nextDouble();

        soma1 = c + d;
        soma2 = a + b;

        if ((b > c) && (d > a) && (soma1 > soma2) && (a % 2 == 0) && (c > 0) && (d > 0)) {
            System.out.println("Valores aceitos.");
        }else{
            System.out.println("Valores não aceitos.");
        }

    }
}
