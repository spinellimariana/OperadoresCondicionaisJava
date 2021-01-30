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

public class L1Exe12area {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double areaQuad, areaCirc, l, r, CONST = 2;
        
        System.out.println("**COMPARATIVO DE ÁREA QUADRADO-CÍRCULO**");
        System.out.print("Digite o valor de L: ");
        l = teclado.nextDouble();
        System.out.print("Digite o valor de R: ");
        r = teclado.nextDouble();

        areaQuad = l * l;
        areaCirc = Math.pow(r, CONST) * Math.PI;

        if (areaQuad > areaCirc) {
            System.out.println("Quadrado tem área maior que o círculo.");
        }else{
            System.out.println("Círculo tem área maior que o quadrado.");
        }
        
        System.out.println();
        System.out.printf("Área do Círculo: %.2f \n", areaCirc);
        System.out.printf("Área do Quadrado: %.2f \n", areaQuad);

    }
}
