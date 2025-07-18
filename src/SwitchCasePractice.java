import java.util.Scanner;
public class SwitchCasePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anyone number from 1 to 7 to know Day");
        int c = sc.nextInt();

        if (c>=1 || c<=7){
            switch (c){
                case 1:
                    System.out.println("Sunday");
                    break;

                case 2:
                    System.out.println("Monday");
                    break;

                case 3:
                    System.out.println("Tuesday");
                    break;

                case 4:
                    System.out.println("Wednesday");
                    break;

                case 5:
                    System.out.println("Thursday");
                    break;

                case 6:
                    System.out.println("Friday");
                    break;

                case 7:
                    System.out.println("Saturday");
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
