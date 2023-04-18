package question9;

public class Question9 {
  public static void main(String args[]){
      String str1 = "example.com", str2 = "Example.com";
      CharSequence cs = "example.com";
      System.out.println("Comparing " + cs +" and " + str2 + ": " + str1.contentEquals(cs));
      System.out.println("Comparing " + str2 +" and " + str1 + ": " + str2.contentEquals(cs));
  }

}
