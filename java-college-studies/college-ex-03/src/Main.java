import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int leaderPoints;
        int flashTeam;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter quantity of points of the leader team: ");
        leaderPoints = Integer.parseInt(scan.next());
        System.out.println("Enter the quantity of points of the flashlight team: ");
        flashTeam = Integer.parseInt(scan.next());
        System.out.println("Number of wins needed for" +
                " the flashlight team reach or surpass the leader team is: " + (leaderPoints - flashTeam) / 3);

    }
}