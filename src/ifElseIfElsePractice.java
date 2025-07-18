import java.util.Scanner;
public class ifElseIfElsePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age<12){
            System.out.println("You are a child");
        } else if (age>=12 && age<=18) {
            System.out.println("You are a Teenager");
        } else {
            System.out.println("You are a Adult");
        }
    }
}
