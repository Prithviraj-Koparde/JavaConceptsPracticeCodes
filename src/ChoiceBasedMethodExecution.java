import java.util.Scanner;
class Maths{
    int add(int a , int b){
        int ans = a+b;
        return ans;
    }

    int sub(int a , int b){
        int ans = a-b;
        return ans;
    }

    int mul(int a , int b){
        int ans = a*b;
        return ans;
    }

    int div(int a , int b){
        int ans = a/b;
        return ans;
    }
}

public class ChoiceBasedMethodExecution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maths obj = new Maths();
        System.out.println("Choose a number of operation to continue a maths operation on two numbers \n1.Additon \n2.Subtraction \n3.Multiplication \n4.Division");
        int choice = sc.nextInt();
        int ans = 0;
        if (choice==1){
            System.out.println("Thanks for choosing addition \n Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans = obj.add(a,b);
        } else if (choice==2) {
            System.out.println("Thanks for choosing subtraction \n Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans = obj.sub(a,b);
        } else if (choice==3) {
            System.out.println("Thanks for choosing Multiplication \n Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans = obj.mul(a,b);
        } else if (choice==4) {
            System.out.println("Thanks for choosing Division \n Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans = obj.div(a,b);
        } else {
            System.out.println("Please enter a valid choice number");
        }

        System.out.println("Your answer is:"+ ans);

    }
}
