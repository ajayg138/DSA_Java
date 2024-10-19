import java.util.Scanner;

public class ArmstrongNumberOrNot {

    public static void Armstrong(int n){
        int ogNum=n;
        int sum=0;

        while(n>0){
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }

        if(ogNum==sum){
            System.out.println("Enter Number is Armstrong Number...");
        }else{
            System.out.println("Enter Number is Not an Armstrong Number...");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        Armstrong(n);
    }
}
