// return sum digits using recursion

class lec29 {
    static int SumOfDigits(int n) {
        // base case
        if (n >= 0 && n <= 9) return n;

//        //recursive relation
//        int smallSum = SumOfDigits(n/10);
//
//        // selfwork
//        int ans = smallSum + n%10;
//        return ans;

        // recursive relation and selfwork
        return SumOfDigits(n / 10) + n % 10;
    }
}

public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        lec29 obj = new lec29();
        System.out.println(obj.SumOfDigits(1234));
    }
}
