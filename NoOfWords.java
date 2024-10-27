import java.util.*;

public class NoOfWords{

    public int wordCount(String str){
        str=str.replaceAll("\\s","");
        int n=str.length();
        int count=0;

        for(int i=0;i<n;i++){
            count++;
        }

        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();

        NoOfWords n= new NoOfWords();
        int res=n.wordCount(str);
        System.out.println(res);
    }
}