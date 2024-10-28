import java.util.*;

public class VectorEx{


    public static void main(String[] args){

        Vector v=new Vector(7);

        v.add(100);
        v.add(101);
        v.add(102);
        v.add(103);
        v.add(104);
        v.add(105);
        v.add(100);
        v.add(101);
        v.add(102);
        v.add(103);
        v.add(104);
        v.add(105);

        System.out.println(v.capacity());

        Iterator itr=v.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}