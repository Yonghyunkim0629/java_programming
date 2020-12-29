import java.util.Scanner;

public class PriceOfFood03 {
    public static void main(String[] args) {
        System.out.println("메뉴 번호를 입력하세요.");
        System.out.println("1. 치킨");
        System.out.println("2. 순대국");
        System.out.println("3. 한우 스테이크");

        Scanner scanner = new Scanner(System.in);
        int menuNUm;

        try {
            String input = scanner.nextLine();
            int menuNum = Integer.parseInt(input);

        } catch (Exception e) {

        }

    }
}
