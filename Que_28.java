import java.util.Scanner;

public class Que_28 {
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
            
            for(int col = 1; col <= str/2 + 1; col++){
                System.out.print(col+row-1  + "\t");
            }
            
            for(int col = str/2; col > 0; col--){
                System.out.print(col+row-1 + "\t");
            }
            
            sp--;
            str += 2;
            
            System.out.println();
        }
    }
}
