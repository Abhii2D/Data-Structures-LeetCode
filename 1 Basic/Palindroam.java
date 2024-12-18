class Palindroam{
    
    static boolean Palin(int x){
        if(x < 0){
            return false;
        }
        int temp = x;
        int reverse = 0;
        while (temp != 0) {
            int local = temp % 10 ; ///  carryOut last digit of values if 123 it filter out 3 
            reverse = reverse * 10 + local; // It add the filterOut element revers * 10 like  0 * 10 + 3 , 3 * 10 + 2 = 32 , 32*10+1 321;
            temp = temp / 10; // It remove the last filterOut Element and provide 12
        }
        return (reverse == x);

    }
    
    public static void main(String[] args) {
        int x = 121;
       System.out.println( Palin(121));
    }
}