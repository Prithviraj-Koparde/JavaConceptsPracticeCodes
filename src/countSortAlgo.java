class lec43{
    public void sort(int [] arr){
        int [] freq = new int[arr.length];
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (i == arr[j]){
                    count++;
                }
            }
            freq[i] = count;
        }

    }
}

public class countSortAlgo {
    public static void main(String[] args) {
        lec43 obj = new lec43();
        int [] arr = {3,2,4,3,5,5,6,4,3,5,7,1};

        System.out.println("Before Count Sort");
        for (int i : arr){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("After Count Sort");
        obj.sort(arr);
        for (int i : arr){
            System.out.println(i);
        }
    }
}
