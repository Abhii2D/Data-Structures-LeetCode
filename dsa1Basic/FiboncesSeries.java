public class FiboncesSeries {

    public static void main(String[] args) {
    int a = 0;
    int b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+ a);
            int sum = a + b;
            a = b ;
            b = sum;
        }

    }
}
