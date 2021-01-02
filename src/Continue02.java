public class Continue02 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            if (i % 2 == 0) {
                i = i + 1; // 여기서 값을 증가시키지 않으면 무한 루프에 빠짐.
                continue;
            }
            System.out.println(i);
            i = i + 1; //다시 while 문으로 돌아갈 때 값을 증가시켜줌.
        }
    }
}
