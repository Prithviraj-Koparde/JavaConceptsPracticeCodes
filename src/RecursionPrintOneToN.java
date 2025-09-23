import java.util.Scanner;
class lec27{
    static void printNumbers(int n){       // function being called on line 8 by updating or decreasing the value of n by n-1
        if (n == 1){
            System.out.println(n);
            return;
        }
        printNumbers(n-1);              // function calling itself
        System.out.println(n);
    }
}

public class RecursionPrintOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec27 obj = new lec27();
        int n = sc.nextInt();
        obj.printNumbers(n);
    }
}
