import leetcode.LeetCode64;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int[][] grid={{0}};
        int res=new LeetCode64().minPathSum(grid);
        System.out.println("res = " + res);
    }
}
