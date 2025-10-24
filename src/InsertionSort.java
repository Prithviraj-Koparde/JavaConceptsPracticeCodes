class lec39{
    static void Sort(int [] arr){
        int n = arr.length;

        for (int i = 1; i<n; i++){
            for (int j = i; j>0; j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,9,3,5,4,2,6,5,7,8,6,10};
        lec39 obj = new lec39();
        obj.Sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
