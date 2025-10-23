// sort an array using selection sort

class lec38{
    static void Sort(int [] arr){
        int n = arr.length;

        for (int i= 0 ; i<n-1; i++){

            int min_value = i;
            for (int j = i+1; j<n; j++){
                if (arr[min_value] > arr[j]){
                    min_value = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_value];
            arr[min_value] = temp;
        }
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        lec38 obj = new lec38();
        int [] arr = {4,5,3,78,6,5,4,56,90};
        obj.Sort(arr);
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
}
