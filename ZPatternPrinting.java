import java.util.Scanner;

public class ZPatternPrinting {
    public static void zPrint(int n){
        //line *
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();

        for(int i=2;i<=n-1;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }

        if(n>1){
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n=sc.nextInt();
//
//        zPrint(n);

        int n=5;

        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=2;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            System.out.println("*");
            // System.out.println();
        }
        if(n>1){
            for(int i=1;i<=n;i++){
                System.out.print("* ");
            }
        }
    }
}
