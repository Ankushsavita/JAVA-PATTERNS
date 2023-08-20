import java.util.Scanner;

public class Que_18 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n/2;
        int str = 1;

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= sp; col++ ){
                System.out.print("   ");
            }
            
            for(int col = 1; col <= str; col++){
                System.out.print("*  ");
            }
            
            if(row <= n/2){
                sp--;
                str += 2;
            }else{
                sp++;
                str -= 2;
            }
            
            System.out.println();
        }
    }
}
