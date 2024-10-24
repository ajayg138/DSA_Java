/* Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/

import java.util.*;
public class MergeTwoArrayy{
    public static void merge(int[] nums1, int[] nums2, int m, int n){

        for(int i=0;i<n;i++){
            nums1[m+1]=nums2[i];
        }

        Arrays.sort(nums1);

        System.out.print(Arrays.toString(nums1));
    }


    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter size1: ");
        // int size1=sc.nextInt();
        // System.out.print("Enter size2: ");
        // int size2=sc.nextInt();

        // int[] arr1=new int[size1+size2];


        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};

        int m=3;
        int n=3;

        merge(nums1,nums2,m,n);

    }
}