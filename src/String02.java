public class String02 {
    public static void main(String[] args) {
        /* String characterName = "해치지마요.";
        int length = characterName.length();
        System.out.println("글자 수:" + length);*/ // 문자열의 글자 수 세기
        
        String fat = "치킨은 살 안 쪄요. 살은 내가 쪄요."; // 문자열의 일부 바꾸기
        String replaced = fat.replaceAll("내가", "네가");
        System.out.println(replaced);
    }
}
