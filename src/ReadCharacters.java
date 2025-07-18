import java.util.Scanner;
public class ReadCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name or any string");
        char string = sc.next().charAt(2);
        System.out.println("Character at 3rd place is: " + string);
    }
}
