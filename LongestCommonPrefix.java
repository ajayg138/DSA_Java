import java.util.*;

public class LongestCommonPrefix{

    public static String prefix(String[] str){
        Arrays.sort(str);

        if(str==null || str.length==0){
            return "";
        }

        String str1=str[0];
        String str2=str[str.length-1];

        int index=0;
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }else{
                break;
            }
        }

        return str1.substring(0,index);
    }

    public static void main(String[] args){
        // String[] str={"flower","flow","flight"};
        String[] str={"dog","racecar","car"};

        String res=prefix(str);
        System.out.println(res);

    }
}