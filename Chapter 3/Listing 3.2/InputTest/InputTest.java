import java.util.*;

/**
 * 이 프로그램은 콘솔 입력을 시연합니다.
 * @version 1.10 2004-02-10
 * @author Cay Horstmann
 */
public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // 사용자의 이름을 입력받습니다.
        System.out.print("당신의 이름은 무엇입니까? ");
        String name = in.nextLine();

        // 사용자의 나이를 입력받습니다.
        System.out.print("당신의 나이는 몇 살입니까? ");
        int age = in.nextInt();

        // 사용자의 이름과 나이를 포함한 인사 메시지를 출력합니다.
        System.out.println("안녕하세요, " + name + ". 내년에는 " + (age + 1) + "세가 되겠네요.");
    }
}
