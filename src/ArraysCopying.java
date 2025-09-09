public class ArraysCopying {
    static void printArray(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void changeArray(int [] arr){        //<-- method to change elements in array to 0
        for (int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        printArray(arr);
        changeArray(arr);
        System.out.println();
        System.out.println("Array after changeArray method");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);       //<-- this will give output 0 in array because of changeArray method call
        }


        int [] arr2 = arr;                      //<-- copying arr to arr2
        for (int i = 0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        // what if we change arr2 values and then print arr and arr2
        arr2[0]=6;
        arr2[1]=7;
        System.out.println("After changing arr2 values");
        for (int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i]);
        }

        System.out.println();
        System.out.println("After changing arr2 values output of arr");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);       //<--here arr will not remain same as before its values will be of arr2
                                            // <-- This happens because of pass by value nature of java seperate memory of arr2 was never created it was pointing
                                            //to arr heap memory so the changes taken in arr2 way reflected in arr array
        }

        System.out.println();
        //Clone operation(in built) in arrays which creates a clone of original array in heap memory with its own addresses

        arr2 = arr.clone();
        arr2[3]= 3;
        System.out.println("arr2 after arr.clone operation");
        for (int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i]);
        }

        System.out.println();
        System.out.println("arr1 after arr.clone operation");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);                           //<-- now here arr will have its og elements due to clone function even after changing values of arr2
        }

        //Another inbuilt operations are Arrays.copyOf(name of array to be copied, length of array) and Arrays.copyOfRange(name of array to be copied, range from where to , where to be copied)
    }
}
