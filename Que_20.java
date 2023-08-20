import java.util.Scanner;

public class Que_20 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int osp = n/2;
        int isp = -1;
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= osp; col++){
                System.out.print("   ");
            }
            System.out.print("*  ");
            
            for(int col = 1; col <= isp; col++){
                System.out.print("   ");
            }
            
            if( row > 1 && row < n){
                System.out.print("*  ");
            }
            
            if(row <= n/2){
                osp--;
                isp += 2;
            }else{
                osp++;
                isp -= 2;
            }
            
            System.out.println();
        }
    }
}
