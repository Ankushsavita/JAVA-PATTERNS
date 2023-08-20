import java.util.Scanner;

public class Que_24 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int str = 1;
        int sp = n-1;
        
        int count = 1;
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= sp; col++){
                System.out.print("   ");
            }
            
            for(int col = 1; col <= str; col++){
                System.out.print(count + "  ");
            }
            count++;
            
            if(row <= n){
                sp--;
                str += 2;
            }
            
            System.out.println();
        }
    }
}
