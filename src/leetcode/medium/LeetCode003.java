package leetcode.medium;

import java.util.*;

public class LeetCode003 {
    //暴力(遍历解空间树）
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1)
            return 1;
        int max=0;
        for(int i=0;i<s.length();i++){
            int res=1;
            String subStr=String.valueOf(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                char newChar=s.charAt(j);
                boolean ifAdd=true;
                for(int k=0;k<subStr.length();k++){
                    if(subStr.charAt(k)==newChar){
                        ifAdd=false;
                        break;
                    }
                }
                if(ifAdd){
                    res++;
                    subStr=subStr.concat(String.valueOf(newChar));
                }else{
                    break;
                }
            }
            if(max<res)
                max=res;
        }
        return max;
    }
    //滑动窗口优化
    public int lengthOfLongestSubstring01(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
