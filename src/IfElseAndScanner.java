import java.util.Scanner;

public class IfElseAndScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("지금 가지고 있는 현금의 액수를 입력하시오.");
        String moneyInScanner = scanner.nextLine();

        try {
            int money = Integer.parseInt(moneyInScanner);
            if (money >= 5000 && money < 9000) {
                System.out.println("밥 먹지마!");
            } else if (money >= 9000 || money <= 15000) {
                System.out.println("국밥을 추천한다!");
            } else {
                System.out.println("알아서 처먹어!");
            }
        } catch (Exception e) {
            System.out.println("숫자를 변환하지 못하였습니다.");
        }
    }
}
