package array_references;

import java.util.Arrays;

public class class_01 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        int[] intArray2 = intArray;
        modifyArray(intArray);
        System.out.println("myIntArray = " + Arrays.toString(intArray));
        System.out.println("AnotherArray = " + Arrays.toString(intArray2));

        intArray2[0] = 1;

        System.out.println("myIntArray = " + Arrays.toString(intArray));
        System.out.println("AnotherArray = " + Arrays.toString(intArray2));
    }

    private static void modifyArray(int[] array){
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        arrayCopy[1] = 2;
        System.out.println("From array Copy: " + Arrays.toString(arrayCopy));

    }
}
