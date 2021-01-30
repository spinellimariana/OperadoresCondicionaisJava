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

public class L1Exe10comissao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeVendedor;
        double salario, salarioTotal, totalVendas, comissao;

        System.out.println("**Comissão dos Vendedores**");
        System.out.print("Digite o nome do vendedor: ");
        nomeVendedor = teclado.next();
        System.out.print("Digite o salário fixo de " + nomeVendedor + ": ");
        salario = teclado.nextDouble();
        System.out.print("Digite o total de vendas em dinheiro realizadas por " + nomeVendedor + ":");
        totalVendas = teclado.nextDouble();

        comissao = totalVendas * 15/100;
        salarioTotal = salario + comissao;

        System.out.printf("O salário total de " + nomeVendedor + " é de R$ %.2f. \n: ", salarioTotal);
    }
}
