public class WrapperType01 {
    public static void main(String[] args) {
      /*  Integer integerNumber = 3;
        Long longNumber = 3L;
        Float floatNumber = 3.0f;
        Double doubleNumber = 3.0d;
        Boolean booleanValue = true; */

        Integer integerNumber01 = 3;
        float floatNumber01 = integerNumber01.floatValue(); // 3.0f
        double doubleNumber01 = integerNumber01.doubleValue(); // 3.0d
        String stringNumber01 = integerNumber01.toString();// "3"
    }
}
