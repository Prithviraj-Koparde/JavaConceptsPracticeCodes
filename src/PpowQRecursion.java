// return p^q
class lec29b {
    static int Pow(int p, int q) {
        // base case
        if (q == 0) return 1;
        // recursive case and self work
        return Pow(p, q - 1) * p;
    }

    // Alternate method
    static int Pow1(int p, int q) {
        if (q == 0) return 1;
        int smallans = Pow1(p, q / 2);
        if (q % 2 == 0) return smallans * smallans; // if even
        // odd
        return p * smallans * smallans;
    }
}

public class PpowQRecursion {
    public static void main(String[] args) {
        lec29b obj = new lec29b();
        System.out.println(obj.Pow(2, 3) + " " + obj.Pow1(2, 4));
    }
}
