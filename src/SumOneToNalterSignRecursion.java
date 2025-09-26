// return sum of 1 to n but with alternat signs like this 1-2+3-4+5-6
class lec30a {
    static int Sum(int n) {
        // base case
        if (n == 0) return 0;
        // recursive case and self work
        if (n % 2 != 0) {
            return Sum(n - 1) + n;
        } else {
            return Sum(n - 1) - n;
        }
    }
}

public class SumOneToNalterSignRecursion {
    public static void main(String[] args) {
        lec30a obj = new lec30a();
        System.out.println(obj.Sum(0));
    }
}
