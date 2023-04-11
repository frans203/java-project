package questionThree;

public class QuestionThree {
    public static void main(String args[]){
        String str = "Original String Value";
        System.out.println("Original String: " + str);

        int val1 = str.codePointBefore(2);
        int val2 = str.codePointBefore(3);
        System.out.println(val1);
        System.out.println(val2);

    }
}
