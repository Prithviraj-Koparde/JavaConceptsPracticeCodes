import java.util.Scanner;

// return k multiples of n for ex n = 2, k = 3 then 2 , 4, 6.
class lec30 {
    static void Kmul(int n, int k) {
        // base  case
        if (k == 1) {
            System.out.println(n);
            return;
        }

        // recursive case
        Kmul(n, k - 1);


        // self work
        System.out.println(n * k);
    }
}

public class KMultipleOfNRecursion {
    public static void main(String[] args) {
        lec30 obj = new lec30();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        obj.Kmul(n, k);
    }
}
