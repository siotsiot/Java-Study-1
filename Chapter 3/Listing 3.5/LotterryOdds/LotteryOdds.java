import java.util.*;

/**
 * 이 프로그램은 for 루프를 사용하여 로또 당첨 확률을 계산합니다.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class LotteryOdds
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // 뽑아야 할 숫자 개수와 최대 숫자를 입력 받습니다.
        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        /*
         * 이항 계수를 계산합니다: n*(n-1)*(n-2)*...*(n-k+1) / (1*2*3*...*k)
         */
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
        {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }

        // 결과를 출력합니다.
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
