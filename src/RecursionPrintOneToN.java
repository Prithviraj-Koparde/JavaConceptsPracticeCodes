import java.util.Scanner;
class lec27{

    // 1 to n
    static void printNumbers(int n){       // function being called on line 8 by updating or decreasing the value of n by n-1
        // base case
        if (n == 1){
            System.out.println(n);
            return;
        }
        // recursive case
        printNumbers(n-1);              // function calling itself
        //self work
        System.out.println(n);
    }

    // n to 1
    static void printDecrease(int n){
        // Base case
        if (n == 1){
            System.out.println(n);
            return;
        }

        // self work
        System.out.println(n);
        // recursive case
        printDecrease(n-1);
    }
}

public class RecursionPrintOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec27 obj = new lec27();
        int n = sc.nextInt();
        obj.printNumbers(n);

        System.out.println(" this is n to 1");
        obj.printDecrease(n);
    }
}
