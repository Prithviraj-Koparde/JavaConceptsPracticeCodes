// return nth number present at input value
class lec28a{
    static int Fibo(int n){
        // break case
        if (n==0 || n==1) return n;

        // recursive relation and
        // self work
        return Fibo(n-1)+Fibo(n-2);
    }
}

public class FiboSeriesUsingRecursion {
    public static void main(String[] args) {
        lec28a obj = new lec28a();
        System.out.println(obj.Fibo(1));
    }
}
