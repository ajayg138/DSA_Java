public class RotateArrayToLeft{

    public static void ShiftToLeft(int[] arr,int d){
        
        int n=arr.length;

        for(int i=0;i<d;i++){
            int first=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d=3;

        int n=arr.length;
        ShiftToLeft(arr, d);

        System.out.println("Array after Left Rotation: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + ((i<n)? ",":""));
        }
    }
}