import java.util.Scanner;

public class Zpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==1 || i==n || (i+j)==(n+1)){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i=2;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }


    }
}