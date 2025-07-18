import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Enter your favorite number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Ye le tera input bhai"+ " " +input);
        sc.nextLine();
        System.out.println("Now Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Tera naam" + " " + name + " " + "hai na");
    }

}
