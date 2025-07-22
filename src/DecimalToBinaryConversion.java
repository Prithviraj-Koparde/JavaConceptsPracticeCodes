import java.util.Scanner;
public class DecimalToBinaryConversion {
//    To convert decimal to binary

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal_number = sc.nextInt();

        int ans = 0; // to store binary result
        int power = 1; // represents place value like 1, 10, 100, ...

        while (decimal_number > 0) {
            int parityOrRemainder = decimal_number % 2;
            ans += parityOrRemainder * power; // add binary digit at correct position
            power *= 10; // move to next place
            decimal_number /= 2; // update decimal
        }
        System.out.print(ans);
    }
}
