/*2) Classe ConsumoResidencial. (Médio) Sabe-se que o quilowatt de energia custa um quinto do
salário mínimo. Faça um programa que receba o valor do salário mínimo e a quantidade de
quilowatts gasta por uma residência. Calcule e imprima:
a) O valor, em reais, de cada quilowatt 
b) O valor, em reais, a ser pago por essa residência
c) O valor a ser pago por essa residência com um desconto de 15%*/
package consumoResidencial;

import java.util.Scanner;
public class ConsumoResidencial{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double minimumSalary, quilowatt, count;

        System.out.println("Type the minimum salary:");
        minimumSalary = sc.nextDouble();
        System.out.println("Type the amount of energy used in the house: ");
        quilowatt = sc.nextDouble();

        count = quilowatt * (minimumSalary / 5);

        System.out.println("The value of each quilowatt is :" +(minimumSalary / 5));
        System.out.println("The bill value is: " +count);
        System.out.println("The bill value with discount is: " + (count * 0.85));


        sc.close();



    }
}