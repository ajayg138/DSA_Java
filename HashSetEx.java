import java.util.*;

public class HashSetEx{

    public static void main(String[] args){

    HashSet hs=new HashSet();

    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(40);
    hs.add(50);
    hs.add(60);

    System.out.println(hs);

    Iterator itr=hs.iterator();

    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    }
}