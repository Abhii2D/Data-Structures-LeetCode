class SpecialNUmbers_InterviewQSystanicSolutions {
    public static void main(String[] args) {

        for (int j = 1; j <999 ; j++) {


        int num = j;
        int sum = 0;
        int clone = num;
        while (num > 0){
            int last = num % 10;
            int fact =1;
            for (int i = 1; i <=last; i++) {
            fact = fact * i;
            }
            num = num / 10;
            sum = sum + fact;
        }
        if(clone==sum)
            System.out.println("It is SpecialNumber :"+ clone);
         }}
}