import java.util.Scanner;

//if a and b are given number then find a raise to power b
public class LoopsPractice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to which you like to add power: ");
        float num = sc.nextFloat();
        System.out.println("Enter the power to the number: ");
        float power = sc.nextFloat();
        float ans = 1;
        for (int i = 1; i<=power ; i++){
            ans *=num;
        }

        System.out.println(ans);
    }
}
