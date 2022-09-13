public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        double points =230d;
        int multi = 2;
        calculateScore(gameOver, points, multi);
        calculateScore(true, 300, 32);
        double result = calculateScore(false, 300, 32);
        System.out.println(result);

    }

    public static double calculateScore(boolean gameOver, double points, int multi) {
        if(gameOver){
            System.out.println("game over");
            System.out.println("Points * Multiplicator = " + (points * multi));
            double finalScore = points * multi;
            return finalScore;
        }else{
            return -1;
        }
    }


}