import java.util.Arrays;
import java.util.Scanner;

/**
 * 이 프로그램은 배열 조작을 시연합니다.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class LotteryDrawing {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        // 1, 2, 3, ..., n까지의 숫자를 배열에 채웁니다
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        // k개의 번호를 뽑아 두 번째 배열에 저장합니다
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            // 0부터 n-1까지의 랜덤 인덱스를 생성합니다
            int r = (int) (Math.random() * n);

            // 랜덤 위치의 요소를 선택합니다
            result[i] = numbers[r];

            // 랜덤 위치에 마지막 요소를 이동시킵니다
            numbers[r] = numbers[n - 1];
            n--;
        }

        // 정렬된 배열을 출력합니다
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result)
            System.out.println(r);
    }
}
