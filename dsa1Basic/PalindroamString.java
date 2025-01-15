public class PalindroamString {

  // wap to check the string is palindrome or not

    static void isPal(String a){
        StringBuilder build = new StringBuilder(a);
        build.reverse();
        String reversed = build.toString();
        if(reversed.equals(a))
            System.out.println("It is Palindrome String :"+ a );
        else
            System.out.println("It is Not Palindrome String : "+ a);
    }
// Wap to find the string is palindrom reverse or not
    static void isRev(String str){
        boolean status = true;
        for(int i = 0;i<= str.length()/2;i++){

                char start = str.charAt(i);
                char end = str.charAt(str.length()-1-i);
        if(start != end)
            status = false;
        else
          status = true;
        }
        System.out.println(status ? "isPRime":"isNotPrime");
    }


    public static void main(String[] args) {
        String name = "oyo";
        isPal(name);
        String op = "abccba";
        isRev(op);
    }
}
