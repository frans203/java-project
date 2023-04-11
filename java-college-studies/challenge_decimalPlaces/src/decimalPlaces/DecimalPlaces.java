package decimalPlaces;

public class DecimalPlaces {
    public static boolean areEqualByThreeDecimalPlaces(double b1, double b2){
        int check1 = (int)(b1*1000);
        int check2 = (int)(b2*1000);
        if(check1 - check2 == 0 ){
            return true;
        }else{
            return false;
        }
    }
}
