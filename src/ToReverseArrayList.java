// WAP to reverse a arraylist
import java.util.*;

class lec24{

    // method 1
    static void ArrListReverse(ArrayList<Integer> list){
        int i = 0 , j = list.size()-1;

        while (i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}


public class ToReverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec24 obj = new lec24();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter "+ n + " Elements: ");
        for (int i = 0; i<n; i++){
            int input = sc.nextInt();
            list.add(input);
        }

        System.out.println("Original array is " + list);

        obj.ArrListReverse(list);
        System.out.println("Reversed array is " + list);

        // method 2 is using collection class
        Collections.reverse(list);
        System.out.println("Using collection class ");
        System.out.println(list);


//        // Sort an array list in ascending order with the help of collection.sort method
//        Collections.sort(list);
//        System.out.println(list);
//
//        // Sort an array list in descending order with the help of collection.sort method
//        Collections.sort(list, Collections.reverseOrder());     // here reverseorder is a comparator
//        System.out.println(list);
    }
}
