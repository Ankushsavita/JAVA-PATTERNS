import java.util.Scanner;

public class Que_25 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int str = 1;
        int sp = n-1;
        
        int count = 1;
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= sp; col++){
                System.out.print("\t");
            }
            
            for(int col = 1; col <= str; col++){
                System.out.print(count++ + "\t");
            }
            
            if(row <= n){
                sp--;
                str += 2;
            }
            
            System.out.println();
        }
    }
}
