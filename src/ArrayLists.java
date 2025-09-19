import java.util.ArrayList;
// Array Lists
public class ArrayLists {
    public static void main(String[] args) {
        // declaring arraylist object
        ArrayList<Integer> obj = new ArrayList(Integer.valueOf(5)); // array list of capacity 5 not element 5

        // declaring array list
        ArrayList<Integer> l1 = new ArrayList<>();

        // adding input in arraylist // here new elements will be added at last with add method
        l1.add(5); // 5
        l1.add(4); // 5 4
        l1.add(6); // 5 4 6
        l1.add(7); // 5 4 6 7
        l1.add(8); // 5 4 6 7 8
        l1.add(9); // 5 4 6 7 8 9

        // printing array list
        System.out.println(l1);     // [5,4,6] will be printed

        // to print element at any index
        System.out.println(l1.get(0));  // 5

        // printing input into arraylist
        for (int i = 0; i< l1.size(); i++){
            System.out.println(l1.get(i));  //5,4,6
        }

        // adding element in ith position in arrlist
        l1.set(1,20);
        System.out.println(l1);

        // modifyling a element at ith position
        l1.set(1,0);
        System.out.println(l1);

        // removing any element at ith position
        l1.remove(1);
        System.out.println(l1);

        // removing any element form array list without i
        System.out.println(l1.remove(Integer.valueOf(6)));  // true
        l1.remove(Integer.valueOf(6));
        System.out.println(l1);

        // if we pass a value which doesnt exist in list then it will not throw error
        l1.remove(Integer.valueOf(17));
        System.out.println(l1);
        // we can get boolean value of this if it is present in array list or not
        System.out.println(l1.remove(Integer.valueOf(17)));     // it will return false that a integer method returns


        // Check if any element is present in arraylist or not using contains class
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);            // false cause 60 is not present

        boolean ans1 = l1.contains(Integer.valueOf(9));
        System.out.println(ans1);       // true cause 9 is there

        // declaring array list without specifying class in it this will allow us to enter any type of element in arraylist
        ArrayList l = new ArrayList();
        l.add("Prithvi");
        l.add(25);
        l.add(true);

        System.out.println(l);

    }
}
