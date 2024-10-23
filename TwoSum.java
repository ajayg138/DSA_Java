
import java.util.Arrays;
public class TwoSum{

    public static int[] twosum(int[] arr,int target){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,5,6};
        int target=10;

        int[] ans=twosum(arr, target);
        System.out.print(Arrays.toString(ans));
    }
}