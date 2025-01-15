public class AmstrongNumber {



    public static void main(String[] args) {
    int num = 153;
    int temp = num;
    int ans=0;
    while(num > 0){
        int last = num % 10;
        ans = ans + last * last * last;
        num = num / 10;
    }
    if(temp == ans)
        System.out.println("isAmstrong Number ");
    else
        System.out.println("isNotAmstrong Number ");

    }
}
