import java.util.Scanner;

class Math{
    int addition(int a , int b ){
        int sum = a + b;
        return sum;
    }
}

public class AddTwoNumsUsingMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Math obj = new Math();
        int ans = obj.addition(a,b);

        System.out.println(ans);
    }
}
