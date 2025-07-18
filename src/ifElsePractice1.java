import java.util.Scanner;
public class ifElsePractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check odd or even number: ");
        int a = sc.nextInt();
//
//        if (a%2 == 0 ){
//            System.out.println(a+" "+"an even number");
//        }else {
//            System.out.println(a+ " " + "an odd number");
//        }

        String result;
        result = (a%2 == 0) ? "even" : "odd";
        System.out.println(result);
    }
}
