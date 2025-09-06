public class JavaMethods {
    static void Return(){
        System.out.println("This message is being fetched from method outside main method named Return");
    }

    static void Sum(){
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println(c+ " " + "<-- This is also a sum method called from main method");
    }
    public static void main(String[] args) {
        Return();   //way to call a method out side a main method
        Sum();
    }
}
