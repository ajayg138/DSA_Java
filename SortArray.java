
import java.util.Arrays;
// import java.util.Collections;

public class SortArray{

    public static void sortDecending(int[] arr){

        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int max=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }

            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }

        System.out.println("Array Sorted in Decreasing order: "+Arrays.toString(arr));
    }
    

    public static void main(String[] args){
        // Integer[] arr={1,9,5,2,5,8,6,3,1,4,6,8};
        int[] arr={1,9,5,2,5,8,6,3,1,4,6,8};

        
        // Arrays.sort(arr,Collections.reverseOrder());
        // System.out.println(Arrays.toString(arr));

        sortDecending(arr);
    }
}