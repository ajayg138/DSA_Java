import java.util.*;

public class TreeMapEx{

    public static void main(String args[]){
        TreeMap map=new TreeMap();

        map.put(101,"Ajay");
        map.put(104,"Ajay");
        map.put(107,"Nagesh");
        map.put(103,"Nagesh");
        map.put(105,"Ajay");
        map.put(106,"Ajay");
        map.put(102,"Amol");

        System.out.println(map);
        System.out.println(map.ceilingEntry(100));
        System.out.println(map.ceilingKey(100));
        map.clear();
        System.out.println(map);
        System.out.println(map.higherEntry(108));
    }
} 