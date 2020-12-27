import java.sql.SQLOutput;
import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        System.out.println("영어 단어와 한글 단어를 하나씩 입력해보세요.");
        Scanner scanner = new Scanner(System.in);

        String englishWord = scanner.next(); //next는 뛰어쓰기 기능을 가짐!
        String koreanWord = scanner.next();

        System.out.println("입력된 영단어:" + englishWord);
        System.out.println("입력된 한글 단어:" + koreanWord);
    }
}
