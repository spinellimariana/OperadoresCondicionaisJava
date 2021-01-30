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

public class L1Exe09salario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cadFunc;
        double horasTrab, valorHora, salario;
        String nomeFunc;

        System.out.println("***CALCULAR SALÁRIO***");
        System.out.print("Digite o nome do funcionário: ");
        nomeFunc = teclado.next();
        System.out.print("Digite o número de cadastro do funcionário: ");
        cadFunc = teclado.nextInt();
        System.out.print("Digite o número de horas trabalhadas pelo funcionário: ");
        horasTrab = teclado.nextFloat();
        System.out.print("Digite o valor por hora trabalhada que este funcionário recebe: ");
        valorHora = teclado.nextFloat();

        salario = horasTrab * valorHora;

        System.out.printf("O salário do(a) funcionário(a) " + nomeFunc + ", cadastrado(a) no n. " + cadFunc + ", é de R$ %.2f. \n: ", salario);

    }
}
