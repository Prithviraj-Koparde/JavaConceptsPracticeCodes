//Calculate the sum of all elements in array

class EleSum{
    void sum(){
        int [] arr = {1,5,3};       //<-- given inputs expected output is - 9
        int ans = 0;
        for (int i = 0; i<arr.length; i++){
            ans +=arr[i];
        }

        System.out.println(ans);
    }
}

public class SumOfElementsInArray {
    public static void main(String[] args) {
        EleSum obj = new EleSum();
        obj.sum();
    }
}
