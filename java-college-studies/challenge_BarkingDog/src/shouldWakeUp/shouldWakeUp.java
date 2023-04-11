package shouldWakeUp;

public class shouldWakeUp {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking && (hourOfDay > 22 || hourOfDay < 8) && hourOfDay != -1 && hourOfDay <= 24){
            return true;
        }
        return false;

    }

}
