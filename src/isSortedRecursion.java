// return true if array is sorted else false
class lec33a{
    static boolean isSort(int [] arr, int idx){
        int n = arr.length;
        // base case
        if (idx==n-1) return true;
        //self work
        if (arr[idx]>arr[idx+1]) return false;
        // recursive case
        return isSort(arr,idx+1);
    }
}
public class isSortedRecursion {
    public static void main(String[] args) {
        lec33a obj = new lec33a();
        int [] arr = {1,2,3,4,5,5,6,6,7};
        System.out.println(obj.isSort(arr,0));
    }
}
