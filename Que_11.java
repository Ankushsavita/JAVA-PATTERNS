import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n - row; col++){
                System.out.print("  ");
            }

            for(int col = 0; col <= (2 * row + 1); col++){
                if(col % 2 == 0){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }

            }

            System.out.println();
        }
    }
}
