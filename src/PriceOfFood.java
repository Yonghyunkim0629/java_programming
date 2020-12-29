import java.util.Scanner;

public class PriceOfFood {
    public static void main(String[] args) {
        System.out.println("음식 이름을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name) {
            case "치킨":
                System.out.println("치킨은 5백원 입니다.");
                break;
            case "순대국":
                System.out.println("순대국은 8천원 입니다.");
                break;
            case "한우 스테이크":
                System.out.println("한우 스테이크는 5천원 입니다.");
                break;
            default:
                System.out.println("판매하지 않는 메뉴입니다.");
                break;
        }
    }
}
