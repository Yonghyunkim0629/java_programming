import java.util.Scanner;

public class EggCartonCounterEdit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("총 달걀의 수를 입력하시오.");

        int eggCartonSize = 30; //계란판 하나당 포장되는 달걀의 수 입니다.
        int totalEggs = 0; //총 달걀의 수를 입력받기 위해 0으로 초기화합니다.

        String input = scanner.nextLine();

        try {
            //사용자가 입력한 문자열을 정수로 변환합니다.
            //예외가 발생할 수 있으므로 try 영역 안에 작성합니다.
            totalEggs = Integer.parseInt(input);

            if (totalEggs < 30) {
                System.out.println("계란판이 필요하지 않습니다.");
            } else {
                int totalEggCartons = totalEggs / eggCartonSize;
                System.out.println("총" + totalEggCartons + "개의 계란판이 필요합니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
