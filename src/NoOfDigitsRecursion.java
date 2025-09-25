//Return number of digits in a given number
class lec29a {
    static int NoOfDigits(int n) {
        // base case
        if (n / 10 == 0) return 1;

        // recursive relation and self work
        return NoOfDigits(n / 10) + 1;
    }
}

public class NoOfDigitsRecursion {
    public static void main(String[] args) {
        lec29a obj = new lec29a();
        System.out.println(obj.NoOfDigits(1234));
    }
}
