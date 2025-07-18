import java.util.Scanner;
public class ForLoopPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print it in upto 0");
        int num = sc.nextInt();
        if (num>=0) {
            for (int i = num; i >= 0; i--) {
                System.out.println(i);
            }
        } else{
            System.out.println("Invalid Number. It should be positive number.");
        }
    }
}
