import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                if((col == 0 || col == n-1 || row == 0 || row == n-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
