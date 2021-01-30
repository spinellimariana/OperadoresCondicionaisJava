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

public class L1Exe16jogo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fim, inicio, dur;

        //Só consegui resolver esse exercício com horas inteiras.
        
        System.out.println("**DURAÇÃO DO JOGO**");

        do {
            System.out.print("Digite o horário de início do jogo: ");
            inicio = teclado.nextInt();
        } while (inicio < 0 || inicio > 24);

        do {
            System.out.print("Digite o horário de término do jogo: ");
            fim = teclado.nextInt();
        } while (fim < 0 || fim > 24);

        if (fim < inicio) {
            dur = (24 - inicio) + fim;
            System.out.println("O jogo durou: " + dur + " horas.");

        } else if (fim > inicio) {
            dur = fim - inicio;
            System.out.println("O jogo durou: " + dur + " horas.");
        } else {
            System.out.println("O jogo durou 24 horas.");
        }
    }
}
