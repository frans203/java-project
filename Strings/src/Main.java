public class Main {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "this is a string";
        System.out.println("My string is: " + myString);
        myString = myString + ", and this is more.";
        myString = myString + " \u00A9 2019";
        System.out.println("My new string: " + myString);
        String numberString ="250.55";
        numberString = numberString + "22.33"; //numbers will be concat
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is Equal to " + lastString); //all will be converted to a string;
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is Equal to " + lastString); //all will be converted to a string;

    }
}