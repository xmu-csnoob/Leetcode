package leetcode.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LeetCode001 {
    //最简单的两层循环，O(n²)
    public int[] twoSum01(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length && j != i; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    //利用哈希表实现存取，O(n)
    public int[] twoSum02(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int var=target-nums[i];
            if(hashMap.containsKey(var)){
                int index=hashMap.get(var);
                if(i!=index)
                    return new int[]{i,hashMap.get(var)};
            }
        }
        return new int[]{};
    }
}
