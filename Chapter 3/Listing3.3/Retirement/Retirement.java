import java.util.*;

/**
 * 이 프로그램은 while 루프를 시연합니다.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class Retirement
{
    public static void main(String[] args)
    {
        // 입력 읽기
        Scanner in = new Scanner(System.in);

        System.out.print("퇴직을 위해 필요한 금액은 얼마입니까? ");
        double goal = in.nextDouble();

        System.out.print("매년 기여할 금액은 얼마입니까? ");
        double payment = in.nextDouble();

        System.out.print("이자율(%)은 얼마입니까? ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // 목표 금액에 도달할 때까지 계좌 잔액 업데이트
        while (balance > goal)
        {
            // 올해의 기여금과 이자 추가
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("퇴직할 수 있는 기간은 " + years + "년입니다.");
    }
}
