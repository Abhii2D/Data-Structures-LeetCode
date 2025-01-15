package Searching.Pattern;

public class Pattern1 {
    public static void main(String[] args) {
     /*

      *
      **
      ***

      * */
        System.out.println("Pattern 1");
      for (int i = 1;i<=4;i++){
          for(int j = 1 ;j<=i;j++){
              System.out.print(" *");
          }
          System.out.println();
      }


        /*

         ***
         **
         *

         * */
        System.out.println("Pattern 2");
        for (int i = 1;i<=4;i++){
            for(int j = 3 ;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }

        /*

         ***
         ***
         ***

         * */
        System.out.println("Pattern 3 ");
        for (int i = 1;i<=4;i++){
            for(int j = 1 ;j<=4;j++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
