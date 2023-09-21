import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PrintList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

//        String c = null;
//        String input = null;
//        StringBuffer b = new StringBuffer();
//        b.append('[');
//        do {
//                System.out.println("Enter the next element Press x to exit the loop : ");
//                b.append(" ,");
//                input = sc.next();
//                c = String.valueOf(b.append(input));
//
//        } while (!("x".equals(input) || input.equals("X")));
//        b.append(']');
//        System.out.println(b[b.length()-1]);


        String c = null;
        String input = null;
        StringBuffer b = new StringBuffer();
        b.append('[');

        while (true) {
            System.out.println("Enter the next element Press x to exit the loop : ");

            input = sc.next();

            if (("x".equals(input) || ("X".equals(input)))){
                break;
            }
            else{
                c = String.valueOf(b.append(input));

            }
            b.append(", ");

        }
        b.append(']');

        System.out.println(b);




//        int[] a = new int[100];
//        int iMax = a.length - 1;
//        StringBuilder d = new StringBuilder();
//        b.append('[');
//        for (int i = 0; ; i++) {
//
//            b.append(a[i]);
//            if (i == iMax)
//                return b.append(']').toString();
//            b.append(", ");
//        }



    }
    public static void alp(String ...l){
    int [] aa= new int[6];
    }
}
