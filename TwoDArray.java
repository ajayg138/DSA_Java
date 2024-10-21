
import java.util.Arrays;

public class TwoDArray{

public static void print2D(int mat[][]){
    // for(int i=0;i<mat.length;i++){

    //     for(int j=0;j<mat[i].length;j++){
    //         System.out.print(mat[i][j]+" ");
    //     }
    // }

    for(int[] row:mat){
        System.out.println(Arrays.toString(row));
    }
}


public static void main(String[] args){
    int mat[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
    
    print2D(mat);

}       
}