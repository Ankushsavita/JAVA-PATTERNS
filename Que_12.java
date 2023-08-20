import java.util.Scanner;

public class Que_12 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n-1;
        int str = 1;

        for(int row = 1; row <= n; row++){
           for(int col = 1; col <= sp; col++){
               System.out.print("   ");
           }

           for(int col = 1; col <= str; col++){
               if(col % 2 == 1){
                   System.out.print("*  ");
               }else{
                   System.out.print("!  ");
               }
           }

           sp--;
           str += 2;

            System.out.println();
        }
    }
}
