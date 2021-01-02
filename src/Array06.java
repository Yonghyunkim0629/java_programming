import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        String[] days = {"월","화","수","목","금","토","일"};
        String[] days02 = Arrays.copyOf(days, 9);

        days02[7] = "일";
        days02[8] = "안녕";

        for (String s : days02) {
            System.out.println(s);
        }
    }
}
