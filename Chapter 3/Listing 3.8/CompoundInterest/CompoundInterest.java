/**
 * 이 프로그램은 2차원 배열에 표 형식의 데이터를 저장하는 방법을 보여줍니다.
 * @version 1.40 2004-02-10
 * @author Cay Horstmann
 */
public class CompoundInterest
{
    public static void main(String[] args)
    {
        final double STARTRATE = 10; // 초기 이자율
        final int NRATES = 6; // 이자율 개수
        final int NYEARS = 10; // 연도 개수

        // 이자율을 10%에서 15%까지 설정
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        // 초기 잔액을 10000으로 설정
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        // 미래 연도의 이자를 계산
        for (int i = 1; i < balances.length; i++)
        {
            for (int j = 0; j < balances[i].length; j++)
            {
                // 이전 연도의 잔액을 이전 행에서 가져옴
                double oldBalance = balances[i - 1][j];

                // 이자 계산
                double interest = oldBalance * interestRate[j];

                // 올해의 잔액 계산
                balances[i][j] = oldBalance + interest;
            }
        }

        // 이자율 한 행 출력
        for (int j = 0; j < interestRate.length; j++)
            System.out.printf("%9.0f%%", 100 * interestRate[j]);

        System.out.println();

        // 잔액 테이블 출력
        for (double[] row : balances)
        {
            // 테이블 행 출력
            for (double b : row)
                System.out.printf("%10.2f", b);

            System.out.println();
        }
    }
}
