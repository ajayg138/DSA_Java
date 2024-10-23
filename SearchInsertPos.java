public class SearchInsertPos{

    public static int insert(int[] nums,int target){

        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }


    public static void main(String[] args){
        int[]  nums={1,3,5,6};
        int target=7;

        int res=insert(nums,target);
        System.out.println("Index is: "+res);

    }
}