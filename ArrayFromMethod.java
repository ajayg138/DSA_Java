public class ArrayFromMethod{

    public static int[] m1(){
        return new int[] {1,2,3};
    }

    public static void main(String args[]){
        int[] arr=m1();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+((i<arr.length-1)? ",":""));
        } 

    }
}