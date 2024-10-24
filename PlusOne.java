public class PlusOne{
    
    public static int plusOne(int[] digits) {
        int n=digits.length;

        int num=0;

        for(int i=0;i<n;i++){
            num=(num*10)+digits[i];
        }

        return num=num+1;
    }
    public static void main(String args[]){
        int[] digits={1,2,3};
        int res=plusOne(digits);
    }
}