import java.util.Scanner;

public class Que_21 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(col <= row) System.out.print("*  ");
                else System.out.print("   ");
            }
            
            for(int col = 2; col <= n; col++){
                if(col <= n - row ) System.out.print("   ");
                else System.out.print("*  ");
            }
            
            System.out.println();
        }
    }
}
