package miniCalculadora;

import java.util.Scanner;

/* Exercício 1
 * Aluno: FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 */

public class MiniCalculadora {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        double n1 = scan.nextDouble();
        System.out.println("Enter a second Number");
        double n2 = scan.nextDouble();
        int division = (int)n1/(int)n2;
        System.out.println("n1 + n2 = " + (n1 + n2));
        System.out.println("n1 - n2 = " + (n1 - n2));
        System.out.println("n1 * n2 = " +  (n1 * n2));
        System.out.println("Integer part of n1 / n2 = " +  division);
        System.out.println("Rest of n1 / n2 = " +  (n1%n2));
        System.out.println("Quadratic root of n2 = " + (Math.pow(n2, 0.5)));
        System.out.println("n1 power 2 = " + (Math.pow(n1, 2.0)));

    }
}
