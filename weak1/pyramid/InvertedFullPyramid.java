package weak1.pyramid;
import java.util.Scanner;
public class InvertedFullPyramid {
    public static void main(String[] args) {
        System.out.println("home many row you want to see ");
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int space=1;space<=row-i;space++)  {    // 1-> 0, 2-> 1, 3-> 2
                System.out.print(" "); }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
