public class RemoveElement{
    public static int remove(int[] arr,int val){
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i] != val){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        int[] arr={3,2,2,3};
        int val=3;

        int res=remove(arr, val);
        System.out.print("Count is: "+res);

    }
}