package weak1;

import java.util.Scanner;

public class hollowSquare {
//            ******
//            *    *
//            *    *
//            *    *
//            *    *
//            ******
    public static void main(String[] args) {
        System.out.println("home many row you want to see ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || i==n || i==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
