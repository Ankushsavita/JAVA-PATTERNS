import java.util.Scanner;

public class Que_33 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = n; row >= 1; row--){
            for(int col = 1; col < row; col++){
                System.out.print("   ");
            }
            
            for(int col = row; col < n; col++){
                System.out.print(col + "  ");
            }
            
            System.out.print(0 + "  ");
            
            for(int col = n-1; col >= row; col--){
                System.out.print(col + "  ");
            }
            
            System.out.println();
        }
    }
}
