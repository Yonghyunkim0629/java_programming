import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("복사할 파일명을 입력하세요.");
        String sourceFileName = scanner.nextLine();

        System.out.println("저장할 파일명을 입력하세요.");
        String saveFileName = scanner.nextLine();

        //파일을 읽음
        FileInputStream inputStream = null;
        //파일을 씀
        FileWriter writer = null;

        try {
            //복사할 파일명으로 FileInputStream을 생성
            inputStream = new FileInputStream(sourceFileName);
        } catch (FileNotFoundException e) {
            System.out.println("존재하지 않는 파일명입니다." + sourceFileName);
            System.exit(10);
        }

        try {
            writer = new FileWriter(saveFileName);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다." + saveFileName);
            System.exit(11);
        }

        Scanner fileReader = new Scanner(inputStream);

        while (fileReader.hasNextLine()) {
            //파일에 추가적으로 읽을 내용이 있다면 이 구간을 계속해서 반복
            //복사할 파일에서 문자열 한줄을 읽어옴
            String line = fileReader.nextLine();

            try {
                //새로 저장할 파일에 읽어온 문자열 한줄 쓰고 줄바꿈을 함
                writer.write(line);
                writer.write("\n");
            } catch (IOException e) {
                //파일쓰기에 실패한 경우
                System.out.println("파일 쓰기에 실패했습니다." + saveFileName);
                System.exit(12);
            }
        }
        //복사가 끝나면 메세지를 출력
        System.out.println("파일이 복사되었습니다.");
        System.out.println("원본 파일: " + sourceFileName);
        System.out.println("복사 파일: " + saveFileName);

        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일을 닫는 중 문제가 생겼습니다.");
        }
    }
}
