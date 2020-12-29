import java.util.Scanner;

public class EggCartonCounter {
    public static void main(String[] args) {
        System.out.println("*달걀 30개당 하나의 계란판이 필요합니다.");
        System.out.println("달걀의 갯수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int eggCarton = 30;
        int eggNum;
        try {
            eggNum = scanner.nextInt();
        } catch (Exception e) {
            eggNum = -1;
        }

        if (eggNum > 30) {
          int  needCartons = (eggNum / eggCarton) + 1;
            System.out.println("총" + needCartons + "개의 계란판이 필요합니다.");
        } else if (eggNum == 30) {
            System.out.println("총 1개의 계란판이 필요합니다.");
        } else {
            System.out.println("계란판이 필요하지 않습니다.");
        }
    }
}
