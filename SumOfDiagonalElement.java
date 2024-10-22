public class SumOfDiagonalElement{
    public static void sumOfDiagonal(int mat[][],int N){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j){
                    sum1 += mat[i][j];
                }

                if((i+j)==(N-1)){
                    sum2 += mat[i][j];
                }
            }
        }

        System.out.print("Sum of Principal Diagonal: "+sum1);
        System.out.print("\nSum of Secondary Diagonal: "+sum2);
    }

    public static void main(String[] args) {
     int mat[][]={{2,2,-3},
               {4,5,-2},
                {1,5,-3}};

    sumOfDiagonal(mat, 3);

    }
}