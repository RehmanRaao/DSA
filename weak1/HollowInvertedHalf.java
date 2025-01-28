package weak1;

import java.util.Scanner;

public class HollowInvertedHalf {
//    *****
//    *  *
//    * *
//    **
//    *
    public static void main(String[] args) {
        System.out.println("home many row you want to see ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i+1; j++){    //n-1+1
              //System.out.print("*");
              if(i==1 || j==1) System.out.print("*");
              else if(j==n-i+1) System.out.print("*");   // j= 5-2+1
              else System.out.print(" ");
          }
            System.out.println();
      }

    }
}
