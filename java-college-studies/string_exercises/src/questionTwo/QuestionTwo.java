package questionTwo;

public class QuestionTwo {
    public static void main(String args[]){
        String str = "This is a String!";
        System.out.println("Original String: " + str);
        int val1 = str.codePointAt(0);
        int val2 = str.codePointAt(10);
        System.out.println("Character 1 (unicode point): " + val1);
        System.out.println("Character 2 (unicode point): " + val2);
    }
}
