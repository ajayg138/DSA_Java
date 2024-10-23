public class RemoveDuplicates{

    public static int count(int[] arr){
        int n=arr.length;

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4};

        int res=count(arr);
        System.out.println("Number of unique elements present in array: "+res);

        for(int i=0;i<res;i++){
            System.out.print(arr[i]+((i<res-1)? ",":""));
        }
    }}
