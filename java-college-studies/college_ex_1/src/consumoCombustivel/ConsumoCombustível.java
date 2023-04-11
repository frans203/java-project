package consumoCombustivel;

import java.util.Scanner;
/* Exercício 3
 * Aluno: FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 */
public class ConsumoCombustível {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time spent(h):");
        int time = scan.nextInt();
        System.out.println("Enter average speed (km/h): ");
        double speed = scan.nextDouble();
        double distance = time * speed;
        double fuelQuantity = distance / 12;
        System.out.println("Average speed = " + speed);
        System.out.println("Time spent = " + time);
        System.out.println("Distance = " + distance);
        System.out.println("Quantity of fuel = " + fuelQuantity);


    }
}
