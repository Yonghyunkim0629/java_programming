public class Array04 {
    public static void main(String[] args) {
        String[] days = {"월","화","수","목","금","토","일"};
        System.out.println(days[7]); 
        /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
        at Array04.main(Array04.java:4)*/ //예외발생
    }
}
