public class Main {
    public static void main(String[] args) {
        int result = 1 + 2; //1 + 2 = 3;
        int result2 = result * 22;
        System.out.println(result2 + result);
        System.out.println(result2);
        System.out.println(result);
        int result3 = result2 / 10;
        System.out.println(result3);
        int result4 = result3 % 6;
        System.out.println(result4);

        //result = result + 1;

        result++;
        System.out.println(result); //4

        result2--;
        System.out.println(result2); //65

        //result = result + 2;
        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 5;
        System.out.println(result);

        result -=10;
        System.out.println(result);

        //if statement
        boolean isAlien = true;

        if(isAlien){
            System.out.println("is alien");
        }else{
            System.out.println("not alien");
        }
        if(isAlien == false){
            System.out.println("still not alien!");
        }
        if(isAlien == true){
            System.out.println("still alien!");
        }

        int topScore = 29;
        if(topScore <= 100){
            System.out.println("You got the high score!");
        }else{
            System.out.println("Not the high score");
        }

        int secondTopScore = 10;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("first verification true");
        }else{
            System.out.println("First verification false");
        }

        if(topScore > 90 || secondTopScore <=90){
            System.out.println("one or both conditions true");
        }else{
            System.out.println("all of conditions are false");
        }

        if(topScore > 90 && secondTopScore <=90){
            System.out.println(" both conditions true");
        }else{
            System.out.println("at least one of conditions are false");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This value is true");
        }
        boolean isCar = false;
        if(isCar){
            System.out.println("this value is true ");
        }else{
            System.out.println("isCar is false");
        }

        if(!isCar){
            System.out.println("using the 'not' operator ");
        }

        boolean wasCar = isCar ? true : false;

        System.out.println("wasCar variable value:" + wasCar);
        if(wasCar){
            System.out.println("wasCar");
        }else{
            System.out.println("wasCart not true");
        }

        System.out.println("TEST ABOUT OPERATORS");
        double n1 = 20.00d;
        double n2 = 80.00d;
        double sum = (n1 + n2) * 100;
        double remainder = sum % 40.00;
        System.out.println("The remainder: " + remainder);
        boolean verifyValue = (remainder == 0) ? true : false;

        System.out.println("Boolean value: " + verifyValue);

        if(remainder > 0){
            System.out.println("Got some remainder");
        }else{
            System.out.println("Doesn't have a remainder");
        }
    }
}