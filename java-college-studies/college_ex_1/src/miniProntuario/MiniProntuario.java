package miniProntuario;

import java.util.Scanner;

public class MiniProntuario {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = 24;
        int y = 4;
        double pulsations[][] = new double[x][y];
        double biggerValue = 0;
        double averagePulsations = 0;
        double sumPulsations = 0;

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.printf("Enter pulsation for patient %d at time %d: \n", j+1, i+1 );
                pulsations[i][j] = scan.nextDouble();
                sumPulsations +=  pulsations[i][j];

            }

        }

        averagePulsations = sumPulsations/(x*y);
        System.out.println("Average of ALL pulsations: " + averagePulsations);

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                double value = pulsations[i][j];
                if(value > biggerValue){
                    biggerValue = value;
                }
            }
        }


        calcAverage(pulsations, 1, x, y, averagePulsations);

        calcAverage(pulsations, 2, x, y, averagePulsations);

        calcAverage(pulsations, 3, x, y, averagePulsations);

        calcAverage(pulsations, 4, x, y, averagePulsations);










    }

    public static void calcAverage(double arr[][], int patientValue, int xValue, int yValue, double averagePulsations){
        System.out.printf("Average for patient " + patientValue + ": ");
        double sumValue = 0;
        double average = 0;
        for(int i=0;i<xValue;i++){
            double currentValue = arr[i][patientValue-1];
            sumValue += currentValue;
        }
        average = sumValue/yValue;
        System.out.println(average);

        if(average > averagePulsations){
            System.out.println("Patient number "
                    + patientValue
                    + " has a average pulsation of "
                    + average
                    + " Bigger than the average of all patients"

            );
        }


    }
}
