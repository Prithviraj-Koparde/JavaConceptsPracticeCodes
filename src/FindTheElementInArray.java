//find the given element in the array

class array{
    void findEle(){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,11,12,13,14};
        int ans = -1;
        int x = 13;
        for (int i = 0; i <arr.length; i++){
            if (x == arr[i]){
                ans = i;
            }
        }
        if (ans == -1){
            System.out.println(x+" "+"Not found in array...");
        }else {
            System.out.println("Found element"+" "+ x +" "+"at index" +" "+ans);
        }


    }
}
public class FindTheElementInArray {
    public static void main(String[] args) {
        array obj = new array();
        obj.findEle();
    }
}
