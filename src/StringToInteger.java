import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String intScanner = scanner.nextLine();
        int number = Integer.parseInt(intScanner);
        number = number + 1; //정수형으로 합
        System.out.println("입력된 숫자의 다음 숫자는 " + number + 1 + "입니다."); //1을 추가 할 시 String 형으로 합 number
        // + "1"과같음
    }
}
