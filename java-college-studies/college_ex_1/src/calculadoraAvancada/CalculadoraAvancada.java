package calculadoraAvancada;

import java.util.Scanner;

public class CalculadoraAvancada {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        double n = scan.nextDouble();
        int option;
        System.out.println("Enter a option(1-9):");
        System.out.println("1) double");
        System.out.println("2) triple");
        System.out.println("3) half");
        System.out.println("4) Power to 2");
        System.out.println("5) Power to 3");
        System.out.println("6) Square root");
        System.out.println("7) Cube root");
        System.out.println("8) module");
        System.out.println("9) inverse");
        System.out.println("Press 0 to close the program");
        option = scan.nextInt();


        switch (option){
            case 1:
                System.out.println("Double value: " + (2*n));
                break;
            case 2:
                System.out.println("Triple value: " + (3*n));
                break;
            case 3:
                System.out.println("Half value: " + (n/2));
                break;
            case 4:
                System.out.println("Value power to 2: " + Math.pow(n, 2));
                break;
            case 5:
                System.out.println("Value power to 3: " + Math.pow(n, 3));
                break;
            case 6:
                System.out.println("Square Root:  " + Math.sqrt(n));
                break;
            case 7:
                System.out.println("Cube Root:  " + Math.cbrt(n));
                break;
            case 8:
                if(n < 0){
                    System.out.println("Module: " + (n*-1));
                }else{
                    System.out.println("Module: " + (n));

                }
                break;
            case 9:
                System.out.println("Inverse: " + (1/n));
                break;



        }
    }
}
