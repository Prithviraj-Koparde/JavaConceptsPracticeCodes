import java.util.Scanner;
public class WhileLoopPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of your choice: ");
        int n = scanner.nextInt();
        System.out.println("Now Choose option 1 for printing upto n number or option 2 to get sum upto n number");
        int choice = scanner.nextInt();
        int i = 1;
        int sum = 0;

        if (choice == 1 && choice < 2 && choice > 0){
            while(i<=n){
                System.out.println(i);
                i++;
            }
        } else if (choice == 2 && choice < 3 && choice > 1) {
            while (i<=n){
                sum = sum + i;
                i++;
            }
            System.out.println(sum + "!!!");
        } else {
            System.out.println("Invalid Choice");
        }


    }
}
