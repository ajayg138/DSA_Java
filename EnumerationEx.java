import java.util.*;

public class EnumerationEx{
    public static void main(String[] args){

        Vector v=new Vector();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add("Ajay");

        // System.out.println(v);

        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}