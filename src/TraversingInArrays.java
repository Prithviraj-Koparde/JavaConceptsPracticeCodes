class Arrays{
    void singlearr(){
        int [] ages = new int[200];

        ages [0] = 1;
        ages [1] = 1;
        ages [2] = 1;
        ages [3] = 1;
        ages [4] = 1;
        ages [5] = 1;
        ages [6] = 1;
        ages [7] = 1;
        ages [88] = 1000000;
        ages [9] = 1;
        ages [10] = 1;
        ages [11] = 1;


        // Traversing in arrays using For loop , for each loop , and while loop.
        for (int i = 0 ; i<ages.length; i++){
            System.out.println(ages[i]);
        }

        for (int age : ages){   //<- this is a "for each" method in which a full array can be printed by putting it into another  variable but disadvantage is that only full array can be print we cannot change the range of printing
            System.out.println(age);
        }


        int i=0;
        while (i < ages.length){
            System.out.println(ages[i]);
            i++;
        }
    }
}

public class TraversingInArrays {
    public static void main(String[] args) {
        Arrays obj = new Arrays();
        obj.singlearr();
    }
}
