import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        double productValue;
        double discount;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(is);

        System.out.println("Enter value of the product: ");
        productValue = Double.parseDouble(br.readLine());
        System.out.println("Enter value of the discount: ");
        discount = Double.parseDouble((br.readLine()));
        System.out.println("Value of discount: " + discount);
        System.out.println("Value of product with discount: " + (productValue - (discount*productValue)/100));

    }
}