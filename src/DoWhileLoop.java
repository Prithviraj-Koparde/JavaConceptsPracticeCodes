import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get counting from 0: ");
        int n = sc.nextInt();
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<=n);

    }
}
