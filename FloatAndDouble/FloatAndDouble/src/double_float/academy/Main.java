package double_float.academy;

public class Main {
    public static void main(String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My minimum value = " + myMinFloatValue);
        System.out.println("My maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My minimum value = " + myMinDoubleValue);
        System.out.println("My maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        double myDoubleValue = 5.00 / 3.00; //use D or F bor respectively double types or float types
        float myFloatValue = 5F / 3f;

        //another way is to use cast

        float mySecondFloat =  (float)3.32;

        System.out.println("Int: " + myIntValue);
        System.out.println("Float: " + myFloatValue);
        System.out.println("Double: " + myDoubleValue);

        //challenge

        double pounds = 200d;
        double kgs = pounds * 0.45359237;
        System.out.println("Pounds: " + pounds + " in Kilograms: " + kgs);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);




    }
}
