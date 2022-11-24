
import java.util.*;

public class CheckString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name  = ");
        String a = sc.nextLine();
        System.out.print("Enter the second name  = ");
        String b = sc.nextLine();

        if ( a.equals(b) ) {
                System.out.println("String are equal");
            } else {
                System.out.println("String are not equal");
            }


//        {
//            if (a == b) {
//                System.out.println(a.equals(b));
//            } else {
//                System.out.println(a.equals(b));
//            }
//        }


    }
}

