import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하십시오.");
        String integerInput01 = scanner.nextLine();
        System.out.println("두번째 정수를 입력하십시오.");
        String integerInput02 = scanner.nextLine();
        int input01 = Integer.parseInt(integerInput01);
        int input02 = Integer.parseInt(integerInput02);
        int addInteger = input01 + input02;
        System.out.println("두 정수의 합: " + addInteger);*/ //여기까지 내가 한 것.

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하시오.");
        String inputNum01 = scanner.nextLine();
        System.out.println("두번째 수를 입력하시오.");
        String inputNum02 = scanner.nextLine();

        try {
            int number01 = Integer.parseInt(inputNum01);
            int number02 = Integer.parseInt(inputNum02);
            int sum = number01 + number02;
            System.out.println("두 수를 더합 값은 " + sum + "입니다.");
        } catch (Exception e) {
            System.out.println("숫자를 변환하는 동안 오류가 발생했습니다.");
        }
    }
}
