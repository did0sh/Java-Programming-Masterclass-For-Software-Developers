package section4_Expressions;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && isBarking){
            return true;
        } else {
            return false;
        }
    }
}
