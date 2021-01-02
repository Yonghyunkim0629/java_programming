public class ArraySum {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i : a){
            sum += i;
        }
        System.out.println(sum);
    }
}

/* 위와 같은 문법 [i]를 기억할것!
for (int i = 0; i < a.length; a++) {
    sum += a[i]
        }*/
