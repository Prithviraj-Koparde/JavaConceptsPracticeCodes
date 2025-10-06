// print array elements recursively
class lec32{
    static void PrintArr(int [] arr, int index){
        int n = arr.length;
        // base case
        if (arr.length==0 || index == arr.length) return;
        //self work
        System.out.println(arr[index]);
        // recursive case
        PrintArr(arr,index+1);
    }
}

public class PrintArrEleRecursively {
    public static void main(String[] args) {
        lec32 obj = new lec32();
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        obj.PrintArr(arr, 0);
    }
}
