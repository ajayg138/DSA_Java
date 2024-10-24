public class ArrangeMinMaxAlternate {

    public static void reArrange(long[] arr,int N){
        long[] temp=new long[N];

        int small=0;
        int large=N-1;

        boolean flag=true;

        for(int i=0;i<N;i++){
            if(flag){
                temp[i]=arr[large--];
            }else {
                temp[i]=arr[small++];
            }
            flag= !flag;
        }

        for(int i=0;i<N;i++){
            arr[i]=temp[i];
        }


    }

    public static void main(String[] args) {
        long[] arr={1,2,3,4,5,6,7,8};
        int N=arr.length;

        System.out.println("Original Array: ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        reArrange(arr,N);

        System.out.println("Modified Array: ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
