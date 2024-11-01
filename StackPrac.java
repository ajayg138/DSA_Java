import java.util.*;

public class StackPrac{

    public static void main(String[] args){

        Stack<Integer> st=new Stack<>();

        st.push(10);
        st.push(30);
        st.push(40);
        System.out.print(st);
        st.pop();
        System.out.print(st);
        System.out.print(st.peak());
        System.out.print(st);
        System.out.print(st.size());
        System.out.print(st);

        st.push(60);
        st.push(90);
        st.push(80);
        st.push(70);

        System.out.print(st);
                System.out.print(st.peak());
                        System.out.print(st.size());

                        st.pop();
                        st.pop();
                        st.pop();
        System.out.print(st);


    }
}