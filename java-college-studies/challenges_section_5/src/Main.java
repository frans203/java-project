import numberInWord.NumberInWord;
import primeNumber.PrimeNumber;
import isEvenNumber.IsEvenNumber;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int primeNumbersFound = 0;
        //for(int i=1;i<300;i++){
        //   boolean verifyPrimeNumber = primeNumber.PrimeNumber.isPrime(i);
        //   if(verifyPrimeNumber){
        //       System.out.println("found prime number: " + i);
        //       ++primeNumbersFound;
        //   }
        //   if(primeNumbersFound == 3){
        //       break;
        //   }
        // }
//        int number = 4;
//        int finishNumber = 20;
//        int totalEvenNumbersFound = 0;
//        while(number <= finishNumber){
//            number++;
//            if(!IsEvenNumber.isEvenNumber(number)){
////                System.out.println("first Not even number found: " + number);
//               continue;
//            }else{
//                ++totalEvenNumbersFound;
//            }
//            if(totalEvenNumbersFound == 5){
//                break;
//            }
//            System.out.println("Even number is: " + number);
//        }
//        System.out.println("Total even numbers found: " + totalEvenNumbersFound);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String yourName = scanner.next();
        scanner.nextLine();

        System.out.println("Your name is " + yourName + "and you have " + (2022 - yearOfBirth) + " years old");


    }
}