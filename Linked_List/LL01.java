
import java.util.*;


public class LL01 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("Ram");
        System.out.println(list);
        list.addLast("good boy");
        System.out.println(list);

        System.out.println(list.size());

        //print each index.........
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ->");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
