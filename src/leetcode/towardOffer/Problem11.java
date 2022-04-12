package leetcode.towardOffer;

public class Problem11 {
    //暴力搜索
    //时间复杂度O(n)
    public int method01(int[] numbers) {
        for(int i=numbers.length-1;i>0;i--){
            if(numbers[i]<numbers[i-1]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}
