import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's is your first name: ");
        String name = scan.next();
        System.out.println("name: " + name);
        System.out.println("Enter double number: ");
        double n1 = Double.parseDouble(scan.next());
        System.out.println("Double value: " + n1);
    }
}