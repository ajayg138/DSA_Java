import java.util.Scanner;

public class EqualityOfArray{


    public static int Equality(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            return -1;
        }

        int n1=arr1.length;

        for(int i=0;i<n1;i++){
            
            if(arr1[i]==arr2[i]){
                    return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1=sc.nextInt();
    
        System.out.println("Enter n2: ");
        int n2=sc.nextInt();

        int[] arr1=new int[n1];
        System.err.println("Enter Elements of Arr1: ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        int[] arr2=new int[n2];
        System.err.println("Enter Elements of Arr2: ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        int res = Equality(arr1,arr2);
        if(res == -1){
            System.err.println("Arrays are not equal..");
        }else{
            System.err.println("Arrays are equal...");
        }

    }
}