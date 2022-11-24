import java.util.*;
public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year here : ");
        int year = sc.nextInt();


        if (year > 1582) {

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("This year is leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("Invalid year");
        }
    }
}

//        if(year>=1582) {
//
//            if(year%400==0) {
//                System.out.println(year+" leap year");
//            }else if(year%4==0 && year%100!=0) {
//                System.out.println(year+" leap year");
//            }else {
//                System.out.println(year+" not a leap year");
//            }
//        }else {
//            System.out.println("Enter a correct year");
//        }

