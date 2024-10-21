public class ṬransposeOfMat{

    static final int M=3;
    static final int N=4;

    public static void Transpose(int A[][],int B[][]){
        int i,j;
        for(i=0;i<N;i++)
            for(j=0;j<M;j++)
                B[i][j]=A[j][i];
    }
    
    public static void main(String[] args) {
        int A[][]={{1,1,1,1},
                    {2,2,2,2},
                    {3,3,3,3}};

        int B[][]=new int[N][M],i,j;

        Transpose(A, B);

        System.out.println("Transpose of Matrix: ");
        for(i=0;i<N;i++){
            for(j=0;j<M;j++){
                System.err.print(B[i][j]+"\t");
            }System.err.println("\n");
        }


    }
}
