import java.util.*;

public class LinkedListEx{



    public static void main(String[] args){


        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);



        LinkedList ll=new LinkedList(al);

        ll.add("Ajay");
        ll.add("Vijay");
        ll.add(10);
        ll.add(20);
        ll.add(20);
        ll.add(null);
        ll.add(null);

        // ll.removeFirst();
        // ll.removeLast();

        Iterator itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}