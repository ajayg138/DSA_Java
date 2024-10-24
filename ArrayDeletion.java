import java.util.Scanner;

public class ArrayDeletion {

    public static void main(String[] args) {

        int[] arr=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size=sc.nextInt();



        System.out.println("Enter Element of an Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array before Deletion: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+", ");
        }

        System.out.println();
        System.out.println("Enter the Position of element to be deleted: ");
        int pos=sc.nextInt();

        for(int i=pos;i<size;i++){
            arr[i]=arr[i+1];
        }
        --size;


        System.out.println("Array after Deletion: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+", ");
        }

    }
}
