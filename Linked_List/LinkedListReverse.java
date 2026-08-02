
import java.util.*;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> list1=new LinkedList<>();
        list1.addLast("a");
        list1.addLast("b");
        list1.addLast("c");
        list1.addLast("d");
        System.out.println("Original List:"+list1);

        LinkedList<String> list2=new LinkedList<>();
        for(int i=0;i<list1.size();i++){
            list2.addFirst(list1.get(i));

        }
        System.out.print("Reverse List:"+list2);
    }
}
