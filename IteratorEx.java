import java.util.*;

public class IteratorEx{


    public static void main(String[] args){
        // //using Iterator

        // List l=new ArrayList();

        // l.add(10);
        // l.add("Ajay");
        // l.add(20);
        // l.add(2330);
        // l.add(23);
        // l.add(202);

        // Iterator itr=l.iterator();

        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }


        //using ListIterator

        List li=new ArrayList();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add("Ajay");

        ListIterator litr=li.listIterator();
        // while(litr.hasNext()){
        //     System.out.println(litr.next());
        // }

        for(int i=0;i<li.size();i++){
            litr.next();
        }
        System.out.println("_--------------------_");

        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}