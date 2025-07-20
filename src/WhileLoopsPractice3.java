import java.util.Scanner;

//print the number of digits in a given number
public class WhileLoopsPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its digit count: ");
        int num = sc.nextInt();
        int count = 0;

        while (num>0){
            num/=10;
            count++;
        }

        System.out.println("Entered number contains: "+ count + " Digits");
    }
}
