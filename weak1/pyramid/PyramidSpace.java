package weak1.pyramid;

import java.util.Scanner;

public class PyramidSpace {

//                    *
//                   * *
//                  * * *
//                 * * * *
//                * * * * *

    public static void main(String[] args) {
        System.out.println("home many row you want to see ");
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int space=1;space<=row-i;space++)  {
                System.out.print(" "); }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }}
    }
