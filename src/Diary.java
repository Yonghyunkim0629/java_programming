import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Diary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("원하는 작업 번호를 입력해주세요.");
            System.out.println("1. 일기 읽기");
            System.out.println("2. 새 일기");
            System.out.println("3. 종료");

            int taskNum;

            try {
                String input = scanner.nextLine();
                taskNum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            if (taskNum == 1) {
                System.out.println("년도를 입력하세요. (예: 1996)");
                String yearInput = scanner.nextLine();

                System.out.println("월을 입력하세요. (예: 06)");
                String monthInput = scanner.nextLine();

                System.out.println("날짜를 입력하세요. (예:29)");
                String dayInput = scanner.nextLine();

                String fileName = yearInput + '-' + monthInput + '-' + dayInput + ".txt";

                FileInputStream inputStream;

                try {
                    inputStream = new FileInputStream(fileName);
                } catch (FileNotFoundException e) {
                    System.out.println("일기가 존재하지 않습니다.");
                    continue;
                }
                System.out.println(yearInput + "-" + monthInput + "-" + dayInput + "의 일기");

                Scanner reader = new Scanner(inputStream);

                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
                System.out.println("\n");
                
                reader.close();
            }

            else if (taskNum == 2) {
                System.out.println("년도를 입력하세요. (예: 1996)");
                String yearInput = scanner.nextLine();

                System.out.println("월을 입력하세요. (예: 06)");
                String monthInput = scanner.nextLine();

                System.out.println("날짜를 입력하세요. (예: 29)");
                String dayInput = scanner.nextLine();

                String fileName = yearInput + "-" + monthInput + "-" + dayInput + ".txt";

                FileWriter writer;

                try {
                   writer = new FileWriter(fileName);
                } catch (IOException e) {
                    System.out.println("파일 생성에 실패했습니다.");
                    continue;
                }

                System.out.println("날씨를 입력하세요.");
                String weatherInput = scanner.nextLine();

                System.out.println("제목을 입력하세요.");
                String titleInput = scanner.nextLine();

                try {
                    writer.write("날씨: " + weatherInput);
                    writer.write("\n");
                    writer.write("제목: " + titleInput);
                    writer.write("\n");
                } catch (IOException e) {
                    System.out.println("일기에 문자열을 입력하지 못했습니다.");
                }

                System.out.println("일기 내용을 작성하시오.");
                System.out.println("(종료 : 빈 줄에서 엔터키 입력)");

                while (true) {
                    String input = scanner.nextLine();

                    if (input.equals("")) {
                        break;
                    }

                    try {
                        writer.write(input); // String input (scanner)로 입력받아서 여기다 삽입
                        writer.write("\n");
                    } catch (IOException e) {
                        System.out.println("일기에 문자열을 쓰지 못했습니다.");
                    }
                }

                try {
                   writer.close();
                } catch (IOException e) {
                    System.out.println("일기를 닫지 못했습니다.");
                }
            }

            else if (taskNum == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
