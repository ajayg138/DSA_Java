
import java.util.Arrays;



public class MergeTwoArray{

    public static int[] mergeArray(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;

        int[] merge=new int[n1+n2];

        for(int i=0;i<n1;i++){
            merge[i]=arr1[i];
        }

        for(int i=0;i<n2;i++){
            merge[n1+i]=arr2[i];
        }

        return merge;
    }
    public static void main(String[] args){
        int[] arr1={5,8,9,1,2,3,4};
        int[] arr2={4,7,10};


        // int n1=arr1.length;
        // int n2=arr2.length;
        // int n=n1+n2;

        // int[] merge=new int[n];
        // System.arraycopy(arr1, 0, merge, 0, n1);
        // System.arraycopy(arr2, 0, merge, n1, n2);

        // System.out.println("Result= " + Arrays.toString(merge));


        int[] merge=mergeArray(arr1, arr2);

        System.out.println("merge Array: "+Arrays.toString(merge));
        // for(int i=0;i<merge.length;i++){
        //     System.out.print(Arrays.toString(merge)+((i<merge.length-1)?",":""));
        // }
    }
}