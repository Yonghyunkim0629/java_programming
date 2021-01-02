import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        System.out.println("지금부터 0~100사이의 숫자를 하나 뽑겠습니다.");
        System.out.println("7번 안에 숫자를 맞추시오.");

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println(8 - i + "번의 기회가 남았습니다.");

            System.out.println("추측한 숫자를 입력하시오");
            String input = scanner.nextLine();
            int inputNumber = Integer.parseInt(input);

            if (inputNumber == randomNumber) {
                System.out.println("정답입니다.");
                break;
            } else if (inputNumber < randomNumber) {
                System.out.println("제가 생각한 숫자보다 작습니다.");
            } else {
                System.out.println("제가 생각한 숫자보다 큽니다.");
            }

            if (i == 7) {
                System.out.println("더 이상의 기회가 남지 않았습니다.");
            }
        }
        System.out.println("게임을 종료합니다.");
    }
}
