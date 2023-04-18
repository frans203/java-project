package rhEmpresa;

import java.text.DecimalFormat;
import java.util.Scanner;
/* Exercício 9
 * Aluno: FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 */
public class RhEmpresa {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        if(n>0 && n<80){
            String arrayNames[] = new String[n];
            double arraySalary[] = new double[n];
            double biggerSalary = 0;

            for(int i=0;i<n;i++){
                System.out.println("Enter name for person " + (i+1) + " :");
                arrayNames[i] = scan.next();
                System.out.println("Enter salary for person " + (i+1) + " :");
                arraySalary[i] = scan.nextDouble();
            }
            for(int i=0;i<n;i++){
                if(arraySalary[i] > biggerSalary){
                    biggerSalary = arraySalary[i];
                }
            }
            System.out.println("Bigger salary: R$" + df.format(biggerSalary));
            System.out.println("Names of employees with salary bigger or equal to the bigger salary: ");
            for(int i=0;i<n;i++) {
                if(arraySalary[i] >= biggerSalary){
                    System.out.println(arrayNames[i]);
                }
            }
            }else{
            return;
        }

    }
}
