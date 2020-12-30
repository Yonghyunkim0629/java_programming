import java.util.Scanner;

public class ForPractice {
    public static void main(String[] args) {

        //Exercise 01
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
