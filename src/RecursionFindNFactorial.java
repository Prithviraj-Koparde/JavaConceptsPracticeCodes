// find factorial of a number using recursion
class lec28{
    static int factorial(int n){
        // base case
        if (n==0) return 1;

        // recursive relation
        int smallans = factorial(n-1);

        // self work
        return n * smallans;        // can also  be written as n * factorial(n-1); without need to write int smallans variable
    }
}

public class RecursionFindNFactorial {
    public static void main(String[] args) {
        lec28 obj = new lec28();
        System.out.println(obj.factorial(50));
    }
}
