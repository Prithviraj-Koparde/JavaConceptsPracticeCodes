import java.util.Scanner;
//Print reverse version of entered number
public class LoopsPractice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it: ");
        int num = sc.nextInt();
        int ans = 0;
//        while(num>0){
//            ans = num%10;
//            System.out.println(ans);
//            num /= 10;
//        }

        while(num>0){
            ans = ans * 10 + num%10;
            num /=10;
        }

        System.out.println(ans);

    }
}
