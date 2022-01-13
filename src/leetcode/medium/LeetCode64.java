package leetcode.medium;

public class LeetCode64 {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for(int i=1;i<grid.length;i++){
            for(int j=0;j<=i;j++){
                dp[i][0]+=grid[j][0];
            }
        }
        for(int i=1;i<grid[0].length;i++){
            for(int j=0;j<=i;j++){
                dp[0][i]+=grid[0][j];
            }
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                dp[i][j]=Math.min(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
