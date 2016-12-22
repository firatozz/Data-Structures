
package hanoi;

import java.util.Scanner;


public class Hanoi {
    
    public static void move(int n, char A, char B, char C){
        if( n == 1 )
            System.out.println(A + "-->" + B);
        else{
            move(n-1, A, C, B);
            move(1, A, B, C);
            move(n-1, C, B, A);
        }
        return;
    }
    
    public static void main(String[] args) {
        
        System.out.print("enter n value :");
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        move(n, 'A', 'B', 'C');
        
    }
}
