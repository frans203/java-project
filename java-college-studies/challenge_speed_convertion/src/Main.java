public class Main {
    public static void main(String[] args) {
        long ex1 = toMilesPerHour(1.5);
        System.out.println(ex1);
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1l;
        }
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            double milesPerHour =  toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + Math.round(milesPerHour) + " mi/h");
        }

    }
}