import java.util.*;

/**
 * 이 프로그램은 do/while 루프를 시연합니다.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class Retirement2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("매년 기여할 금액은 얼마입니까? ");
        double payment = in.nextDouble();

        System.out.print("이자율(%)은 얼마입니까? ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;
        String input;

        // 사용자가 은퇴 준비가 되지 않을 때까지 계좌 잔액 업데이트
        do
        {
            // 올해의 기여금과 이자 추가
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            // 현재 잔액 출력
            System.out.printf("연도 %d 후, 계좌 잔액은 %,.2f입니다.%n", year, balance);

            // 은퇴 준비 여부를 묻고 입력 받기
            System.out.print("은퇴 준비가 되었습니까? (Y/N) ");
            input = in.next();
        }
        while (input.equals("N"));
    }
}
