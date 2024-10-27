import java.util.*;

public class MaxOccurChar{

    public static void main(String[] args){
        // char a=64;
        // System.out.println(a);

        // String str="aabbcccccc";
        // int[] arr=new int[127];
        // int n=str.length();

        // for(int i=0;i<n;i++){
        //     arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        // }

        // int max=0;
        // char c=' ';

        // for(int i=0;i<n;i++){
        //     if(arr[str.charAt(i)]>max){
        //         max=arr[str.charAt(i)];
        //         c=str.charAt(i);
        //     }
        // }

        // System.out.println("Max occuring character is "+c+" and no. of occurance are "+max);


        // String str="ffaassddddddf a s d f g g h e";
        // str=str.replaceAll("\\s","");
        // System.out.println(str);
        // int n=str.length();

        // int[] arr=new int[127];
        // for(int i=0;i<n;i++){
        //     arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        // }

        // int max=0;
        // char ch=' ';
        // for(int i=0;i<n;i++){
        //     if(arr[str.charAt(i)]>max){
        //         max=arr[str.charAt(i)];
        //         ch=str.charAt(i);
        //     }
        // }
        // System.out.println(ch+" is max occurred character for "+max+" times...");

        // int min=1;
        // char c=' ';
        // for(int i=0;i<n;i++){
        //     if(arr[str.charAt(i)]<=min){
        //         min=arr[str.charAt(i)];
        //         c=str.charAt(i);
        //     }
        // }
        // System.out.println(c+" is min occurred character for "+min+" times...");


        String s="abbcccaaaa";

        HashMap<Character, Integer> hm=new HashMap<>();

        char[] c=s.toCharArray();
        for(char ch:c){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }

        int maxCount=0;
        char maxChar=' ';

        for(Map.Entry<Character, Integer> me: hm.entrySet()){
            if(maxCount < me.getValue()){
                maxCount=me.getValue();
                maxChar=me.getKey();
            }
        }
        System.out.println("Maximum repeated character is: "+maxChar);
    }
}