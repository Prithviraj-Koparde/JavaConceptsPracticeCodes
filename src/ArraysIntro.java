class ArrayDemo{
    void singlearr(){
        int [] ages = new int[3];
        ages [0] = 5;
        ages [1] = 6;
        ages [2] = 10;

        System.out.println("garbage value of ages array:"+ages);   //<---- this will give garbage values
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println("length of array:"+ ages.length);    // this will give length of array

    }
    void multiarr(){
        int [][] vote = new int[3][2];

        vote [0] [1] = 5;
        vote [1] [0] = 2;
        vote [1] [1] = 3;

        System.out.println(vote);
        System.out.println(vote[0][0]);
        System.out.println(vote[0][1]);
        System.out.println(vote[1][0]);
        System.out.println(vote[1][1]);
        System.out.println("array length:"+ vote.length);
    }
}

public class ArraysIntro {
    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.singlearr();
        obj.multiarr();
    }
}
