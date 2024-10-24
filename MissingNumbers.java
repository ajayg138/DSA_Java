public class MissingNumbers{

    public int missNum(int[] arr){
        int n=arr.length;
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }

        int total=(n*(n+1)/2);

        int diff=total-sum;

        return diff;
    }


    public static void main(String[] args){
        int[] arr={1,2,3,4,0};

        MissingNumbers m=new MissingNumbers();
        int res = m.missNum(arr);
        System.out.print(res);
    }
}