import java.util.*;

public class SortString{

    public static void main(String[] args){

        String s="Ajay";

        char[] arrayS=s.toCharArray();
        Arrays.sort(arrayS);

        String sortS=new String(arrayS);
        System.out.println(sortS);
    }
}