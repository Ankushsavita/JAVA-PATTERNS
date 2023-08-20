import java.util.Scanner;

public class Que_19 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int str = n/2 + 1;
        int sp = -1;
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= str; col++){
                System.out.print("*  ");
            }
            
            for(int col = 1; col <= sp; col++){
                System.out.print("-  ");
            }
            
            for(int col = str; col >= 0; col--){
                System.out.print("*  ");
            }
            
            if(row <= n/2){
                str--;
                sp += 2;
            }else{
                str++;
                sp -= 2;
            }
            
            System.out.println();
        }
    }
}
