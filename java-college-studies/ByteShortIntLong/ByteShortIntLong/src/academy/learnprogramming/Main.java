package academy.learnprogramming;

public class Main {
    public static void main(String[] args){
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("BUSTED MAX VALUE = " + (myMaxIntValue + 1)); //turn into a negative number
        System.out.println("BUSED MIN VALUE = " + (myMinIntValue -1)); //turn into a positive number

        int myMaxIntTest = 2_147_483_647; //will be printed without underscores

        System.out.println(myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue)   ;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;  //need to be written with L in the end 
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L; //without L java will treat this as a integer, and will displah
        // and error

        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte)(myMinByteValue/2); //converting integer
        short myNewShortValue = (short)(myMinShortValue/2);

        //challenge
        byte b1 = 10;
        short s1 = 20;
        int i1= 50;
        long result = (50000L + 10L * (b1 + s1 + i1));
        System.out.println("Result of the challenge = " + result);

        short shortTotal = (short)(1000 + 10 *
                (b1 + s1 + i1));





    }
}
