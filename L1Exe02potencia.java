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

public class L1Exe02potencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base, expoente, potencia;

        System.out.println("**OPERAÇÃO DE POTENCIAÇÃO**");
        System.out.print("Digite o valor da base: ");
        base = teclado.nextDouble();
        System.out.print("Digite o valor do expoente: ");
        expoente = teclado.nextDouble();
        
        potencia = Math.pow(base, expoente);

        /*potencia = (double) Math.pow(base, expoente);
        o double acima é um cast, não precisa dele pq a var já foi declarada como double.*/
        
        System.out.printf("O valor da potência é: %.2f. \n", potencia);
    }
}
