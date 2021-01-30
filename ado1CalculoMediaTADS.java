/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class ado1CalculoMediaTADS {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //criei um objeto do tipo Scanner chamado "teclado
        String nomeAluno;
        double n1, n2, media;
        double P1 = 0.4, P2 = 0.6; //P1 == 0.4 e P2 0.6
        int faltas, TOTAL_FALTAS = 18;

        System.out.println("*--* Cálculo Média Algoritmos - TADS *--*");
        System.out.println("Nome: ");
        nomeAluno = teclado.next();
        System.out.println("N1: ");
        n1 = teclado.nextDouble();
        System.out.println("N2: ");
        n2 = teclado.nextDouble();
        System.out.println("Faltas: ");
        faltas = teclado.nextInt();
        media = (n1 * P1) + (n2 * P2);

        if ((media >= 6.0) && (faltas <= TOTAL_FALTAS)) {
            System.out.println(nomeAluno + ", você está aprovado(a) com média " + media + ".");
        } else if ((media < 6.0) && (faltas <= TOTAL_FALTAS)) {
            System.out.println(nomeAluno + ", você está reprovado(a) com média " + media + ".");
        } else if ((media >= 6.0) && (faltas > TOTAL_FALTAS)) {
            System.out.println(nomeAluno + ", sua média é " + media + " mas você está reprovado(a) por faltas. Total de faltas: " + faltas + ".");
        } else {
            System.out.println(nomeAluno + ", você está reprovado(a) por nota e por falta. Sua média foi: " + media + ". Total de faltas: " + faltas + ".");
        }

        //TO DO -> saber o motivo ao qual o aluno foi reprovado (Ex. nota, nota e falta ou apenas por faltas)
    }

}
