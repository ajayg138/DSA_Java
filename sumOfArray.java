public class sumOfArray{
    public static void main(String[] args){
        int[] arr={3,2,1,5,4};

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }

        System.out.println("Sum is: "+sum);
    }
}