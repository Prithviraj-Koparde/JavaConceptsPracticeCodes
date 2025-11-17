// sort the array of strings into lexilogical order

class lec39b {
    static void SortString(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_value = i;
            for (int j = i + 1; j < n; j++) {
                if ((arr[j].compareTo(arr[min_value])) < 0) {  // check if arr[j].compareTo(arr[min_value]) is less than 0)
                    min_value = j;
                }
            }

            // swap after j loop
            String temp = arr[i];
            arr[i] = arr[min_value];
            arr[min_value] = temp;
        }
    }
}

public class SelectionSortStringLexOrder {
    public static void main(String[] args) {
        String[] arr = {"kiwi", "apple", "dragonFruit", "mango", "pear", "cherry"};
        lec39b obj = new lec39b();
        obj.SortString(arr);
        for (String i : arr) {
            System.out.print(i + " ");
        }
    }
}
