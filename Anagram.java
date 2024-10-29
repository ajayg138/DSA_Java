import java.util.*;


public class Anagram{
    public static boolean check(String str1,String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        String s1=new String(str1Array);
        String s2=new String(str2Array);

        if(s1.equals(s2)){
            return true;
        }

        return false;

    }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Str1: ");
        String str1=sc.nextLine();

        System.out.println("Enter Str2: ");
        String str2=sc.nextLine();

        boolean res=check(str1,str2);

        if(res==true){
            System.out.println("Anagram...");
        }else{
            System.out.println("Not an Anagram...");
        }

    }
}