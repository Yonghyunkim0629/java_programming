public class MethodDemo1 {
    public static void numbering(int limit) { // 매개변수 (parameter)
        int i = 0;
        while (i < limit) {
            //int limit = 5;
            System.out.println(i);
            i++;
        }
    }
    //재활용, 코드량 -, 유지보수 유리
    public static void main(String[] args) {
        numbering(5); // 인자 (argument)
    }
}
