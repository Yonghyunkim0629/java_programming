import java.io.*;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        //사용자로부터 입력 처리를 담당할 Scanner를 선언합니다.
        Scanner scanner = new Scanner(System.in);

        //반복문 1
        //무한반복. 사용자가 3을 입력하면 반복문을 탈출하도록 구현
        while (true) {
            System.out.println("원하는 작업 번호를 입력해주세요.");
            System.out.println("1. 메모 읽기");
            System.out.println("2. 새 메모");
            System.out.println("3. 종료");

            //사용자가 입력한 명령 번호를 저장할 변수를 선언
            int taskNum;
            
            //nextLine()으로 한 줄 읽어온 뒤 정수형으로 변환해 taskNum에 대입함
            //예외가 발생한 경우 (사용자가 정수가 아닌 값 입력)
            //"잘못된 입력입니다." 출력 후 반복문 1의 처음으로 돌아감
            try {
                String input = scanner.nextLine();
                taskNum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            if (taskNum == 1) {
                System.out.println("메모 파일명을 입력하세요.");

                //사용자로부터 문자열로 파일명을 입력받습니다.
                String fileName = scanner.nextLine();

                //파일 내용을 읽어드리기 위해 FileInputStream을 선언
                FileInputStream inputStream = null;

                try {
                    inputStream = new FileInputStream(fileName);
                } catch (FileNotFoundException e) {
                    System.out.println("파일이 존재하지 않습니다.");
                    continue;
                }
                //FileInputStream이 성공적으로 생성되면 안내 메세지를 출력합니다.
                System.out.println(fileName + "의 내용을 출력합니다.");

                //FileInputStream으로부터 파일의 내용을 읽어드릴 Scanner를 선언
                Scanner reader = new Scanner(inputStream);
                
                //파일의 내용을 한줄씩 읽어 끝까지 출력함
                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
                System.out.println("\n");
                reader.close();
            }
            else if (taskNum == 2) {
                System.out.println("저장할 메모 파일명을 입력하세요.");

                //새 메모를 저장하기 위해서 새 파일명을 입력받습니다.
                String fileName = scanner.nextLine();

                //파일을 쓰기 위해서 FileWriter을 선언
                FileWriter writer = null;

                //사용자가 입력한 파일명을 가지고 FileWriter를 생성
                //파일 생성에 실패한 경우 "파일 생성에 실패했습니다" 출력후
                //반복문의 처음으로 돌아감
                try {
                    writer = new FileWriter(fileName);
                } catch (IOException e) {
                    System.out.println("파일 생성에 실패했습니다.");
                    continue;
                }
                System.out.println("메모할 문자열을 입력하세요.");
                System.out.println("종료: 빈 줄에서 엔터키를 입력하세요.");

                //계속해서 새로운 입력 값을 반기 위해 무한 반복합니다.
                while (true) {
                    String input = scanner.nextLine();

                    //사용자가 입력한 값이 빈 문자열("")이라면
                    //파일에 쓸 문자열을 입력받는 반복문을 탈출

                    if (input.equals("")) {
                        break;
                    }
                    //사용자가 입력한 문자열을 파일에 쓰고
                    //줄바꿈 문자를 통해 줄바꿈을 추가
                    try {
                        writer.write(input);
                        writer.write("\n");
                    } catch (IOException e) {
                        System.out.println("파일에 문자열을 쓰지 못했습니다.");
                    }
                }
                //빈 문자열을 입력받아 반복문을 탈출했다면 입력이 종료된 것이므로
                //파일을 닫음
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("파일을 닫는데 실패했습니다.");
                }
            }
           //종료를 선택한 경우
           else if (taskNum == 3) {
               //프로그램을 종료하는 메시지 출력 후 반복문 1을 탈출
                System.out.println("프로그램을 종료합니다.");
                break;
            }
           else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
