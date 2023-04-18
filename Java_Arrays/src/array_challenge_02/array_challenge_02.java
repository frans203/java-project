package array_challenge_02;

import java.util.Arrays;

public class array_challenge_02 {
    public static void main(String... args){
//        reverse(new int[]{1,2,3,4,5});
        reverseCopy(new int[]{1,2,3,4,5});

    }



    public static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0;i < halfLength; i++ ){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    public static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for(int el:array){
            reversedArray[maxIndex--] = el; //the decrement occurs
            // after the assignment is completed
        }
        System.out.println(Arrays.toString(reversedArray));
        return reversedArray;
    }
}
