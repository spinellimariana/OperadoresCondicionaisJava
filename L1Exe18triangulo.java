package Lista1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class L1Exe18triangulo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, ladoA, ladoB, ladoC;

        System.out.println("**FORMANDO TRIÂNGULOS**");
        System.out.print("Digite o valor do Lado A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor do Lado B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor do Lado C: ");
        c = teclado.nextDouble();
        
        System.out.println();

        if (a > b) {
            if (b > c) {
                ladoA = a;
                ladoB = b;
                ladoC = c;
                System.out.println("Ordem decrescente dos lados: ");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else if (a > c) {
                ladoA = a;
                ladoB = c;
                ladoC = b;
                System.out.println("Ordem decrescente dos lados: ");
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            } else {
                ladoA = c;
                ladoB = a;
                ladoC = b;
                System.out.println("Ordem decrescente dos lados: ");
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        } else if (b > c) {
            if (a > c) {
                ladoA = b;
                ladoB = a;
                ladoC = c;
                System.out.println("Ordem decrescente dos lados: ");
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            } else {
                ladoA = b;
                ladoB = c;
                ladoC = a;
                System.out.println("Ordem decrescente dos lados: ");
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            ladoA = c;
            ladoB = b;
            ladoC = a;
            System.out.println("Ordem decrescente dos lados: ");
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        System.out.println();
        
        if (ladoA >= ladoB + ladoC) {
            System.out.println("Não forma triângulo.");
        } else if ((ladoA * ladoA) == (ladoB * ladoB) + (ladoC * ladoC)) {
            System.out.println("Triângulo Retângulo.");
        } else if ((ladoA * ladoA) > (ladoB * ladoB) + (ladoC * ladoC)) {
            System.out.println("Triângulo Obtusângulo.");
        } else if ((ladoA * ladoA) < (ladoB * ladoB) + (ladoC * ladoC)) {
            System.out.println("Triângulo Acutângulo.");
        } 
        if (ladoA >= ladoB + ladoC) {
        } else if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("Triângulo Equilátero.");
        } else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoC == ladoA)) {
            System.out.println("Triângulo Isósceles.");
        }
    }
}
