import java.util.*;

public class StackPrac{

    public static void main(String[] args){

        Stack<Integer> st=new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.print(st);
        st.pop();
        System.out.print(st);
        System.out.print(st.peak());
        System.out.print(st);
    }
}