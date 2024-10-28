import java.util.*;

public class HashMapEx{

    public static void main(String[] args){
        
        HashMap<Integer,String> map=new HashMap();

        map.put(00,"Ajay");
        map.put(10,"Amol");
        map.put(20,"Nagesh");
        map.put(30,"Onkar");
        map.put(40,"Roshan");
        map.put(50,"Chetan");

        
        System.out.println(map);

        // for(Map.Entry me : map.entrySet())
        // {
        //     System.out.println(me.getKey()+" -> "+me.getValue);
        // }


        Set set=map.entrySet();
        // System.out.println(set);
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            // System.out.println(itr.next());
            Map.Entry entry=(Map.Entry) itr.next();
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}