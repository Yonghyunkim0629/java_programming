public class Operator03 {
    public static void main(String01[] args) {
/*        int number = 5;
        number = 6;
        System.out.println(number);*/
        
        //int number = 1.2; 정수형에 실수형을 입력했기 떄문에 오류
        int number = (int) 1.6; //형 변환
        System.out.println(number); //소수점 아래 수 들은 버려지게 된다.
    }
}
