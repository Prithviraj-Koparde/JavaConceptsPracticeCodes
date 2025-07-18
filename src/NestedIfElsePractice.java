import java.sql.SQLOutput;
import java.util.Scanner;
public class NestedIfElsePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its even and divisible by 3: ");
        int value = sc.nextInt();

//      Method 1
//        if(value%2 == 0){
//            System.out.println("Number"+ " " + value + " " + "is an even number");
//            if (value%3 == 0){
//                System.out.println("And number"+" "+ value + " "+ "is divisible by 3");
//            } else{
//                System.out.println("But"+ " " + value +" " + "is not divisible by 3");
//            }
//        }else{
//            System.out.println("The number is an Odd number");
//        }
//      Method 2
        if (value%2==0 && value%3==0){
            System.out.println("Entered number is even and also divisible by 3");
        }else if (value%2!=0 || value%3!=0){
            System.out.println("Entered number is not divisible by 3");
        }
    }
}
