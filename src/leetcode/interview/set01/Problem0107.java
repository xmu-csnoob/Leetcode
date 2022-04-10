package leetcode.interview.set01;

import java.util.Arrays;

public class Problem0107 {
    public void rotate(int[][] matrix) {
        // 1 2 3 4
        // 5 6 7 8
        // 9 10 11 12
        // 13 14 15 16
        //matrix[1][0]=matrix[1][3]
        //matrix[2][1]=matrix[1][2]
        for(int i=0;i<matrix.length;i++)
        {
           int temp=matrix[0][i];
           matrix[0][i]=matrix[matrix.length-1][i];
           matrix[matrix.length-1][i]=temp;
        }
        System.out.println(Arrays.deepToString(matrix));
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length&&i!=j;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
