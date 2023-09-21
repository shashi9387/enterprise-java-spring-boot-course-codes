
// Question
// Take 2 numbers as inputs and find their HCF and LCM.


import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first  num : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second  num : ");
        int num2 = sc.nextInt();

        if (num1>num2){
            int a = num1;
            int b = num2;

            while(true){
                int temp = 0;
                temp = a % b;
                if(temp == 1)
                {
                    System.out.println("HCF of the two number is1 : " + temp);
                    System.out.println("LCM of the two number is : " + (num1*num2));
                    break;
                }
                if(temp==0){
                    System.out.println("HCF of the two number is2 : " + b);
                    System.out.println("LCM of the two number is : " + (num1*num2)/b);
                    break;
                }
                a = b;
                b = temp;
            }
        }
        else{
            int a = num1;
            int b = num2;

            while(true) {
                int temp = 0;
                temp = b % a;
                if (temp == 1) {
                    System.out.println("HCF of the two number is3 : " + temp);
                    System.out.println("LCM of the two number is : " + (num1 * num2) / temp);
                    break;
                }
                if (temp == 0) {
                    System.out.println("HCF of the two number is4 : " + a);
                    System.out.println("LCM of the two number is : " + (num1 * num2) / a);
                }
                b = a ;
                a = temp;
            }
        }


    }
}
