import java.util.Scanner;

public class StringCompare02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String chicken = "치킨";
        //System.out.println(input == chicken); 문자열을 비교할 때는 메모리 상에서 저장되어 있는 위치를 비교
        System.out.println(input.equals(chicken));
    }
}
