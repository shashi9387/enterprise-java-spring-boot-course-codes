import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int sum=0;
        while(true){
            String n=sc.nextLine();
            if(n.equals("x")){
                break;
            }
            else{
                int a=Integer.parseInt(n);
                sum+=a;
            }
        }
        System.out.println(sum);

    }
}
