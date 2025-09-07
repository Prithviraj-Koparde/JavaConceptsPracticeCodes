import java.util.Scanner;
class Maths{
    int add(int a , int b){         //here int a and int b are formal parameters
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
            ans = obj.add(a,b);     //Calling add method through created obj        // here a and b are actual parameters and are pass by value
        } else if (choice==2) {
            System.out.println("Thanks for choosing subtraction \n Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans = obj.sub(a,b);     //Calling sub method through created obj
        } else if (choice==3) {
            System.out.println("Thanks for choosing Multiplication \n Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans = obj.mul(a,b);     //Calling mul method through created obj
        } else if (choice==4) {
            System.out.println("Thanks for choosing Division \n Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans = obj.div(a,b);     //Calling div method through created obj
        } else {
            System.out.println("Please enter a valid choice number");
        }

        System.out.println("Your answer is:"+ ans);


        //-----------------------------------------------//
        // We also learned about some inbuilt java functions like
        //    1.sqrt    gives you a square root of a number
        //    2.ceil    gives you a highest number of a decimal number like 5.8, 5.9 will be 6
        //    3.floor   gives you a smallest number of a decimal number like 5.3, 5.2 will be 5
        //    These functions gives output in double values in other words in decimal values
    }
}
