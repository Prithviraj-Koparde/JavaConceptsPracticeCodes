package Strings;
import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");

//        setCharAt()
        s.setCharAt(1,'o');
        System.out.println(s);

//        append()
        System.out.println(s.append(" World"));
        System.out.println(s.append(11));

//        Insert() - insert a value at given index and shift previous value at that index forward
        s.insert(4,'a');
        System.out.println(s);

//        deleteCharAt() - deletes character at given index
        s.deleteCharAt(2);
        System.out.println(s);

//        reverse() - reverses the given string
        System.out.println(s.reverse());

//        delete() - deletes character from string according to the given range 1,4 - 1 to 3 get deletes
        System.out.println(s.delete(1,4));
    }
}
