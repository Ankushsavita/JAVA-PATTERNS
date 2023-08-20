import java.util.Scanner;

public class Que_31 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int row = 1; row <= n; row++){
            for(int col = n; col >= 1; col--){
                if(row == col){
                    System.out.print("*  ");
                }else{
                    System.out.print(col + "  ");
                }
            }
            System.out.println();
        }
    }
}
