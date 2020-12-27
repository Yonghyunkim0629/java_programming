import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.in 중요!
        String input = scanner.nextLine();
        System.out.println("안녕하세요." + input + "님!");
    }
}
