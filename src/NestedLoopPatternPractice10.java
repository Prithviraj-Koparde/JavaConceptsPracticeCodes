import java.util.Scanner;
public class NestedLoopPatternPractice10 {
//    To print this pattern
//        1
//       121
//      12321
//     1234321
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to print pattern: ");
    int row = sc.nextInt();
//    System.out.print("Enter columns: ");
//    int col = sc.nextInt();

    for (int i = 1; i<=row ; i++){
        for (int j = 1 ; j<=row-i ; j++){
            System.out.print(" ");
        }

        for (int k = 1; k<=i; k++){
            System.out.print(k);
        }

        for (int l = i-1 ; l>=1; l--){
            System.out.print(l);
        }
        System.out.println();
    }
}
}
