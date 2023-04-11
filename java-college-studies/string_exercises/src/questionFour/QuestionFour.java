package questionFour;

public class QuestionFour {
    public static void main(String args[]){
        String str = "w3rsource.com";
        System.out.println("Original String : " + str);

        int ctr = str.codePointCount(0,10);

        System.out.println(ctr);
    }
}
