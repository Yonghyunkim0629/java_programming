public class EggPackage {
    public static void main(String01[] args) {
        int totalEggNum = 277;
        int packEggNum = 30;
        int remainEggNum = (totalEggNum % packEggNum);

        System.out.println("총 " + remainEggNum + "개의 계란이 남습니다.");
    }
}
