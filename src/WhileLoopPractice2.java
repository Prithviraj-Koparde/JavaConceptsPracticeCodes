import java.util.Scanner;
//Take input from user until he enters -1 then return summ of entered numbers
public class WhileLoopPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to get addition of them and Enter -1 if you are done: ");
        float num = 0;
        float sum = 0;
        while(num!=-1){

            num = sc.nextFloat();
            sum +=num;
        }

        System.out.println(sum+1);
    }
}

