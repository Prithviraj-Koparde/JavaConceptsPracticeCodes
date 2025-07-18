import java.util.Scanner;
public class CalSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello im here to help you calculate simple interest. Please enter your Principal, Rate of Interest, Time in order ");
        System.out.println("Enter Principal: ");
        float P = sc.nextInt();
        System.out.println("Enter RateOfInterest: ");
        float R = sc.nextFloat();
        System.out.println("Enter Time: ");
        float T = sc.nextFloat();

        System.out.println("Wait im processing.....");

        float SI = P * R * T / 100;

        System.out.println("Your Simple Interest Is:" + SI);

    }
}
