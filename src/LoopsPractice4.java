import java.util.Scanner;

// print sum of digits of a given number
public class LoopsPractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to get sum of its each digit: ");
        int num = sc.nextInt();
        int ans = 0;
        while (num> 0){
            ans = ans + num%10; //this is done to add remainder to ans by taking mod of number
            num  /= 10;         //this is done to remove the last digit
        }

        System.out.println("Number of digits in entered number is "+ans);
    }
}
