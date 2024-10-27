import java.util.*;
public class CollectionFramework{

    public static void main(String[] args){
        // ArrayList al=new ArrayList();
        // al.add(10);
        // al.add("Ajay");
        // al.add(12);
        // al.add(true);
        // al.add(4.5);

        // System.out.println(al);
        // System.out.println(al.add("ads"));
        // System.out.println(al.add("ads"));
        // // System.out.println(al.add());
        // // System.out.println(al.add());
        // System.out.println(al.contains(10));
        // System.out.println(al.isEmpty());
        // System.out.println(al.size());
        // al.clear();
        // System.out.println(al);

        

        // ArrayList al2=new ArrayList();
        // al2.add('a');
        // al2.add('b');
        // al2.add("Ajuu");
        // al2.add("Gole");
        // al2.add(true);
        // System.out.println(al2);

        // al.addAll(al2);
        // System.out.println(al);

        // HashMap hm=new HashMap();
        // hm.put(101,"Ajay");
        // hm.put(102,"Roshani");
        // hm.put(103,"Anna");
        // hm.put(104,"Mummy");
        // hm.put(105,"Jay");
        // hm.put(106,"Vijay");

        // System.out.println(hm);


        List l=new ArrayList();
        l.add(10);
        l.add(104);
        l.add(106);
        l.add(103);
        l.add(14);
        l.add(60);

        System.out.println(l);

        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

System.out.println("------------");

        Set s=new HashSet();
        s.add(10);
        s.add(105);
        s.add(104);
        s.add(103);
        s.add(102);
        s.add(101);

        Iterator itr1=s.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}