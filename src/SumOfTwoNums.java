import java.util.Scanner;
public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Two Number For Addition: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Wait im processing....");
        int c = a + b;
        System.out.println("Yeah! Your Result is: " + c);
    }
}
