public class Array05 {
    public static void main(String[] args) {
        String[] days = {"월","화","수","목","금","토","일"};
        days[7] = "일";
        System.out.println(days[7]); //예외발생: days[7] = "일";로 추가 불가능
    }
}
