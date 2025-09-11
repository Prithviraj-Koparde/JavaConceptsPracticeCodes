import java.util.Scanner;

//Check if element x is there or not in array but a set of q questions will be asked each question should be answered
class lec17c{
    static int[] freqArr(int [] arr){
        int [] freq = new int[100001];
        for (int i =0; i<arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
public class ArrayFindX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec17c obj = new lec17c();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        int [] freq = obj.freqArr(arr);
        System.out.println("Now q numbers to check there availability: ");
        int q = sc.nextInt();
        for (int i = 1; i<=q; i++){
            int value = sc.nextInt();
            if (freq[value] > 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}
