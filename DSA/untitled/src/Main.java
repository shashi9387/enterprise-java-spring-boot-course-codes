import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int a = 10;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        int c =12%11;
        System.out.print("Hello and welcome!"  );
        a = 11;
        System.out.println(a);
//        fun(2,3,5,7,56,3,56,8);

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);

        }
        alpha();
        System.out.println(a);
    }
    public static void alpha(){
        System.out.println(a);
        a = 19;
        System.out.println(a);
        int a= 12;
        System.out.println("s"+a);
    }
    public static void fun(int ...list){

        System.out.println(Arrays.toString(list));
    }
}