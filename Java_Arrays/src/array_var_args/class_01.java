package array_var_args;

import java.util.Arrays;
import java.util.Scanner;

public class class_01 {
    public static void main(String... args) {
//        System.out.println("test");
//        String[] splitStrings = "Hello World Again".split(" ");
//        printText(splitStrings);
//        System.out.println("_".repeat(20));
//        printText("Hello text", "text 2", "text 3");
//
//        String[] sArray = {"first", "second", "third", "fourth",
//                "fifth"}; //join: array to string
//        //split: string to array
//        System.out.println(String.join(",", sArray));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values separated by a comma and " +
                "java will create an array and return the min value" +
                " ");
        String stringArrItems = sc.nextLine();
        int[] stringToIntArr = readIntegers(stringArrItems);
        findMin(stringToIntArr);
    }
    private static void printText(String... textList){ //String...
        // text list is a variable argument
        System.out.println(Arrays.toString(textList));
        for(String t: textList){
            System.out.println(t);
        }
    }

    private static int[] readIntegers(String intList) {
        String[] intStringList =  intList.split(",");
        int[] newIntList = new int[intStringList.length];

        for(int i=0;i< intStringList.length;i++){
            newIntList[i] = Integer.parseInt(intStringList[i].trim());
        }

        System.out.println("Array list: " + Arrays.toString(newIntList));

        return  newIntList;
    }

    private static int findMin(int[] intList) {
        int minimumValueStatic = Integer.MAX_VALUE;

        for(int item:intList){
            if(item < minimumValueStatic){
                minimumValueStatic = item;
            }
        }

        System.out.println("minimum value: " + minimumValueStatic);

        return minimumValueStatic;
    }




}