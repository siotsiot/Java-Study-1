import java.math.*;
import java.util.*;

/**
 * 이 프로그램은 큰 숫자를 사용하여 로또의 1등 당첨 확률을 계산합니다.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class BigIntegerTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("How many numbers do you need to draw? ");
        int n = in.nextInt();

        /*
         * 이항 계수를 계산합니다: n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */
        
        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
                BigInteger.valueOf(i));

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
		}
}
