import java.util.*;

public class HashMapCreation{
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();

        hm.put(1,"Ajay");
        hm.put(2,"Pravin");
        hm.put(3,"Onkar");
        hm.put(4,"Amol");
        hm.put(5,"Nagesh");
        hm.put(6,"Roshan");
        hm.put(7,"Chetan");


        System.out.print(hm);


    
    // System.out.println("Hello");
    System.out.println(hm.get("John")); 
    hm.remove("Pravin");
    
}
}
