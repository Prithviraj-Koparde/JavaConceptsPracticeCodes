import org.w3c.dom.ls.LSOutput;

import java.security.Principal;
import java.util.Scanner;

//      Print 1st multiple of 5 as well as 7
public class LoopsPracticeForAndWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if multiple of 5 and 7: ");
        int num = 1;

        while (true){
            if (num%5==0 && num%7==0){
                System.out.println("Gotcha" +" "+ num);
                break;
            }
            num++;
        }

    }

}
