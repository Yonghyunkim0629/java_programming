import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[][] days = {
                {"월","화","수","목","금","토","일"},
                {"일","화","수","목","금","토","일"},
                {"월","화","수","목","금","금","금"},
        };

        String[][] days2 = new String[days.length][days[0].length];

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++){
                days2[i][j] = days[i][j];
                System.out.println(Arrays.toString(days2[0]));
                
            }
        }
    }
}
/* 결과
[월, null, null, null, null, null, null]
        [월, 화, null, null, null, null, null]
        [월, 화, 수, null, null, null, null]
        [월, 화, 수, 목, null, null, null]
        [월, 화, 수, 목, 금, null, null]
        [월, 화, 수, 목, 금, 토, null]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]
        [월, 화, 수, 목, 금, 토, 일]*/
