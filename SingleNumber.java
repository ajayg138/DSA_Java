import java.util.*;

public class SingleNumber{
    public static int number(int[] arr){
        //Brute force Approach...using Hashmap

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:arr){
            if(map.get(num)==1){
                return num;
            }
        }

        return -1;
              
        
        
        
        //optimal Solution...using XOR ^
        
        // int singleNum=0;

        // for(int num:arr){
        //     singleNum ^= num;
        // }
        // return singleNum;
    }

    public static void main(String[] args){
        int[] arr={4,1,2,1,2};

        int res=number(arr);
        System.out.print(res);
    }
}