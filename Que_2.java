import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 0; row < n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
