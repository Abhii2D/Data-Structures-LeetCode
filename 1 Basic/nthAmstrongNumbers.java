public class nthAmstrongNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 1000 ; i++) {
            int temp = i;
            int orig = temp;

            int sum = 0;
            while (temp >0){
                int last = temp % 10;
                sum = sum + last * last * last;
                temp = temp / 10;
            }
            if(sum == orig)
                System.out.print(" "+ sum);
        }
    }
}
