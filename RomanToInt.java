import java.util.*;

public class RomanToInt{

    public static int solution(String str){
        HashMap<Character,Integer> m=new HashMap<>();

        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        int result=0;
        int n=str.length();

        for(int i=0;i<n;i++){
            int value=m.get(str.charAt(i));
            if(i+1<n && value<m.get(str.charAt(i))){
                result -= value;
            }else{
                result += value;
            }
        }

        return result;
    }


    public static void main(String[] args){
        String str="LVIII";

        int res=solution(str);
        System.out.println(res);
    }
}