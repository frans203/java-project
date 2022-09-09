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

        int myIntValue = 5;
        double myDoubleValue = 5.25D; //use D or F bor respectively double types or float types
        float myFloatValue = 3.21F;

        //another way is to use cast

        float mySecondFloat =  (float)3.32;

        System.out.println("Int: " + myIntValue);
        System.out.println("Float: " + myIntValue);
        System.out.println("Double: " + myDoubleValue);
    }
}
