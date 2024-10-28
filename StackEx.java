import java.util.*;

public class StackEx{

    public static void main(String[] args){
        Stack s=new Stack();


        s.push("Ajay");
        s.push("vIJAY");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s);
        s.pop();
        System.out.println(s);
        // s.pop();
        // System.out.println(s);
        
        System.out.println(s.peek());
        System.out.println(s.search("Ajay"));
        System.out.println(s.search("Ajayy"));
        System.out.println(s.empty());


    }
}