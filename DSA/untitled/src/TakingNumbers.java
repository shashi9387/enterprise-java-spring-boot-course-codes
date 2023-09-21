//  Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class TakingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a;
        while(true){
            System.out.println(" Enter the next element, Press x to exit and get the sum :" );
            int sum = 0;
            a = sc.next().charAt(0) ;
            a = (char) (a - 'o');
            sum = sum + a;
            if(a == 'x'){

            System.out.println("Sum is :" + sum);
            break;
        }
        }
    }
}
