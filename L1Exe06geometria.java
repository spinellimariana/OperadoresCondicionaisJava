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

public class L1Exe06geometria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, areaTriang, areaCirc, areaTrap, areaQuad, areaRet, perimRet;
        int CONST = 2;

        System.out.println("**GEOMETRIA**");
        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Digite  valor de C: ");
        c = teclado.nextDouble();

        areaTriang = a * c / CONST;                       //item a
        areaCirc = (double) Math.pow(c, CONST) * Math.PI; //item b  //não precisa desse cast
        areaTrap = (a + b) * c / CONST;                   //item c
        areaQuad = b * b;                                 //item d
        areaRet = a * b;                                  //item e
        perimRet = (CONST * a) + (CONST * b);             //item f

        System.out.printf("A área do triângulo retângulo é de: %.2f. \n", areaTriang);
        System.out.printf("A área do circulo é de: %.2f. \n", areaCirc);
        System.out.printf("A área do trapézio é de: %.2f. \n", areaTrap);
        System.out.printf("A área do quadrado é de: %.2f. \n", areaQuad);
        System.out.printf("A área do retângulo é de: %.2f. \n", areaRet);
        System.out.printf("O perimetro do retângulo é de: %.2f. \n", perimRet);

    }
}
