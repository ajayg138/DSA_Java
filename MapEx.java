import java.util.*;;


public class MapEx{

    public static void main(String[] args){

        Map map=new HashMap();

        map.put(101,"Ajay");
        map.put(102,"Amol");
        map.put(103,"Ajay");
        map.put(104,"Chetan");
        map.put(104,"Nagesh");
        map.put(105,"Roshan");
        map.put(null,"Roshani");
        map.put(106,null);
        map.put(107,null);
        // map.put(null,"Roshaniiiiii");

        System.out.println(map);

        // map.clear();
        System.out.println(map.containsKey(108));

        System.out.println(map.containsValue("Ajay"));
        System.out.println( map.get(102));
        System.out.println( map.remove(102));
        System.out.println(map);
        System.out.println(map.size());



       
    }
}