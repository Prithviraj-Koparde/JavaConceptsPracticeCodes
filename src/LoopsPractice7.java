import java.util.Scanner;

//print factorial of the number
public class LoopsPractice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get it factorial: ");
        int num = sc.nextInt();
        int ans = 1;

//        while (num>0){
//            ans*=num;
//            num--;
//        }
        for (int i = 1 ; i<=num; i++){
            ans *=i;
        }

        System.out.println("Factorial of given number is: "+ans);
    }
}
