import java.lang.Math;

// return minimum cost to reach n-1 either by jumping idx+1 or idx+2
class lec36 {
    static int Best(int[] arr, int n, int idx) {
        // Base case
        if (idx == n - 1) return 0;
        // recursive case
        int opt1 = Math.abs(arr[idx] - arr[idx + 1]) + Best(arr, n, idx + 1);
        if (idx == n - 2) return opt1;
        int opt2 = Math.abs(arr[idx] - arr[idx + 2]) + Best(arr, n, idx + 2);
        return Math.min(opt1, opt2);
    }
}

public class FrogJumpRecProb {
    public static void main(String[] args) {
        int[] h = {10, 30, 40, 20};
        lec36 obj = new lec36();
        int ans = obj.Best(h, h.length, 0);
        System.out.println("Minimum cost is: " + ans);
    }
}
