class SpecialNUmbers_InterviewQSystanicSolutions {
    public static void main(String[] args) {

        //  methods 1 to check num is Special Or Not
        int num = 145; // Input number
        if (isSpecialNumber(num)) {
            System.out.println("The Number is Special: " + num);
        } else {
            System.out.println("The Number is Not Special: " + num);
        }

        ///  method 2 for nth special Numbers
        nthSpecial();



    }

    private static void nthSpecial() {
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
        }

    }


    // Method to check if a number is special
        private static boolean isSpecialNumber(int num) {
            int copy = num; // Save the original number
            int sum = 0;

            // Calculate the sum of factorials of digits
            while (num > 0) {
                int lastDigit = num % 10; // Extract the last digit
                sum += calculateFactorial(lastDigit); // Calculate factorial for the digit
                num /= 10; // Remove the last digit
            }

            return sum == copy; // Return true if the sum matches the original number
        }

        // Method to calculate the factorial of a digit
        private static int calculateFactorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }






