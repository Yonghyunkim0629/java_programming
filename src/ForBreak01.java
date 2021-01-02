public class ForBreak01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("반복 " + i + " 시작");
            if (i == 3) {
                break;
            } //if 문의 닫는 중괄호
            System.out.println("반복 " + i + " 끝");
        }
    }
}
