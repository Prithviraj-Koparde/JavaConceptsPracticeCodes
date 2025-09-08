//Return maximum element from the array assume all nums are +ve
class maxNum{
    void MaxEleFinder(){
        int [] arr = {2,5,6,4,8,10,3};
        int ans = 0;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]>ans){
                ans = arr[i];
            }
        }

        System.out.println("Maximum element of the arrya is"+" "+ans);
    }
}
public class MaxNumInArray {
    public static void main(String[] args) {
        maxNum obj = new maxNum();
        obj.MaxEleFinder();
    }
}
