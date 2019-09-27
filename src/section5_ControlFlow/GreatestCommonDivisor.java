package section5_ControlFlow;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        while(first!=0 && second!=0)
        {
            int c = second;
            second = first%second;
            first = c;
        }
        return first+second;
    }
}
