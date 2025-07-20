import java.util.Scanner;
public class LoopsPractice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get answer in following series 1-2+3-4+5...n: ");
        int num = sc.nextInt();
        int ans = 0;
        for (int i = 1 ; i <=num ; i++){
            if (i%2!=0){  // is odd
                ans += i;
            }else {       // else even
                ans -= i;
            }
        }

        System.out.println("According to the series your answer is: " + ans);
    }
}
