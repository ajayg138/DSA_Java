import java.util.*;

public class ReverseStringEx{

    public static void reverse(String str){
        String rev="";
        int n=str.length();

        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        System.out.println("Reverse String is: "+rev);

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();

        reverse(str);

    }
}