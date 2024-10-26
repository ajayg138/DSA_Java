import java.util.*;

public class StringPalindrome{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int n=str.length();
        String rev="";

        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Entered String is Palindrome...");
        }else{
            System.out.println("Entered String is not Palindrome...");
        }
    }
}