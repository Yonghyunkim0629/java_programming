import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*강아지 몸무게 1kg당 10g의 사료를 급여합니다.*");
        System.out.println("강아지 몸무게를 적으시오.");
        String dogWeight = scanner.nextLine(); //weightInString 참조할 것.

        try {
            int inputDogWeight = Integer.parseInt(dogWeight);
            int sum = inputDogWeight * 10; //sum 보다는 amount 가 더 좋은 변수명
            System.out.println("강아지의 권장 사료랑은 " + sum + "g 입니다.");
        } catch (Exception e) {
            System.out.println("숫자를 변환하는 동안 오류 발생!");
        }
    }
}
