// return p^q
class lec29b {
    static int Pow(int p, int q) {
        // base case
        if (q == 0) return 1;
        // recursive case and self work
        return Pow(p, q - 1) * p;
    }
}

public class PpowQRecursion {
    public static void main(String[] args) {
        lec29b obj = new lec29b();
        System.out.println(obj.Pow(2, 3));
    }
}
