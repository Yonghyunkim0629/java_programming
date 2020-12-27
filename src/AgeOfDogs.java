public class AgeOfDogs {
    public static void main(String[] args) {
        int winterAge = 3;
        int maxAge = 7;
        boolean sameAge = winterAge == maxAge;
        boolean winterIsOrder = winterAge > maxAge;
        boolean maxIsOrder = winterAge < maxAge;

        System.out.println("윈터의 나이가 맥스의 나이와 같은가?: " + sameAge);
        System.out.println("윈터의 나이가 맥스의 나이보다 많은가?: " + winterIsOrder);
        System.out.println("맥스의 나이가 윈터의 나이보다 많은가?: " + maxIsOrder);

    }
}
