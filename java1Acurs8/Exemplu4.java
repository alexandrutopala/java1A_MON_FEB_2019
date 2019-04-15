import java.util.*;

public class Exemplu4 {
    public static void main(String [] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addLast(4);
        list.addFirst(2);
        list.addFirst(8);
        list.removeLast();
        list.addLast(10);
        list.addFirst(9);
        list.addLast(7);
        list.removeFirst();
        list.removeFirst();
        list.addFirst(3);
        list.removeLast();
        list.removeLast();
        list.addLast(0);
        
        System.out.println(list);
        
        
        
    }
}