
import java.util.Arrays;

public class ToMoveAllZeroesToEnd{
    public static void MoveZeroesToEnd(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int maxIndex=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[maxIndex])
                    maxIndex=j;
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[i];
            arr[i]=temp;
        }

        System.out.println("All Zeroes at End: "+Arrays.toString(arr));
    }


    public static void main(String[] args){
        // Integer[] arr={3,0,0,0,0,50,0,6,9,0,5,7,8,0,1};

        int[] arr={3,0,0,0,0,50,0,6,9,0,5,7,8,0,1};

        // Arrays.sort(arr,Collections.reverseOrder());
        

        // System.out.println("Move all Zeroes to end: "+Arrays.toString(arr));

        // MoveZeroesToEnd(arr);

        int[][] arr2D={{1,2,3},
                        {4,5,6},
                        {2,3,4}};

        // System.out.println("2D Array = "+Arrays.toString(arr2D));
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D.length;j++){
                System.out.print(arr2D[i][j]+" ");
            }System.out.println();
        }
        // System.out.println();
    }
}