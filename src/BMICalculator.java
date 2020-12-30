import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("*BMI를 계산합니다.*");
        Scanner scanner = new Scanner(System.in);


            System.out.println("신장을 입력하세요.");
            double height = scanner.nextDouble();

            System.out.println("몸무게를 입력하세요.");
            double weight = scanner.nextDouble();


            double bmi = weight / (height * height) * 10000;

            if(bmi < 18.5) {
                System.out.println("저체중입니다.");
            } else if (bmi > 18.5 && bmi <= 23.0) {
                System.out.println("정상체중입니다.");
            } else {
                System.out.println("과체중입니다.");
            }

    }
}
