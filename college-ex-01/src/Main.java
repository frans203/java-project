public class Main {
    public static void main(String[] args) {
        double spent1 = 15000d;
        double spent2 = 23000d;
        double spent3 = 17000d;
        double totalSpent = spent1 + spent2 + spent3;

        System.out.println("Total spent in trimester: $" + totalSpent);
        System.out.println("Spent monthly average in the trimester: $" + totalSpent/3);

    }
}