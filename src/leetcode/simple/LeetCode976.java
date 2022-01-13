package leetcode.simple;

import java.util.Arrays;

public class LeetCode976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i]>=nums[i-1]+nums[i-2]){
                continue;
            }else{
                return (nums[i]+nums[i-1]+nums[i-2]);
            }
        }
        return 0;
    }
}
