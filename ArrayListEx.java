import java.util.*;

public class ArrayListEx{

    public static void main(String[] args){
        ArrayList al=new ArrayList();

        al.add(105);
        al.add(104);
        al.add(103);
        al.add(102);
        al.add(101);
        al.add("Ajay");

        System.out.println(al);

        Iterator itr=al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        ArrayList al2=new ArrayList();

        al2.add(201);
        al2.add(202);
        al2.add(203);
        al2.add(204);
        al.addAll(al2);

        System.out.println(al);
        System.out.println(al.contains(1000));
        System.out.println(al.size());

        al.clear();
        System.out.println(al);


    }
}