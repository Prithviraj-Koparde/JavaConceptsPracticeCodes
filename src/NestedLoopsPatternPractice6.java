import java.util.Scanner;
public class NestedLoopsPatternPractice6 {
    public static void main(String[] args) {
//        To print this pattern
//            1234
//            2341
//            3412
//            4123
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print pattern for it: ");
        int row = sc.nextInt();

        for (int i=1; i<=row; i++){
            for (int j=i; j<=row; j++){
                System.out.print(j);
            }
            for (int k = 1; k<=i-1; k++){  // focus on this logic rest is easy bruh
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
