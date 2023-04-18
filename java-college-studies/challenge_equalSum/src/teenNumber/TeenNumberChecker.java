package teenNumber;

public class TeenNumberChecker {
    public static boolean hasTeen(int n1, int n2, int n3){
        if(n1 >= 13 && n1 <= 19){
            return true;
        }
        if(n2 >= 13 && n2 <= 19){
            return true;
        }if(n3 >= 13 && n3 <= 19){
            return true;
        }
        return false;


    }

    public static boolean isTeen(int n1){
        if(n1 >= 13 && n1 <= 19){
            return true;
        }

        return false;


    }
}
