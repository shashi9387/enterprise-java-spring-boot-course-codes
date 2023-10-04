import java.util.Scanner;

public class EditStringInput {
    static Scanner sc = new Scanner(System.in);
    public static String inputString(String str){
//        StringBuffer str1 = "";
        String str2 = "";
        char check = 'a';
//        System.out.println("Hellow World");
        for(int i=1; i<3;i++) {
            if (str.charAt(i) == check) {
                continue;
            }
            else{
                str2 = str2 + str.charAt(i);
            }
        }
        for(int i=3; i<str.length();i++) {
                str2 = str2 + str.charAt(i);
        }
        return str2;
    }
    public static void main(String[] args) {

        String input = sc.nextLine();
//        EditStringInput edit = new EditStringInput();
//        String input1 = "";
//        input1 = input1 + "anl";
//        System.out.println(input1);
        System.out.println(inputString(input));


    }
}
