package leetcode.medium;

public class LeetCode526 {
    public int result=0;
    public int countArrangement(int n) {
        int[] numbers=new int[n];
        for(int i=1;i<=n;i++)
            numbers[i-1]=i;
        boolean[] isUsed=new boolean[n];
        backTrack(0,n,numbers,isUsed);
        return result;
    }
    public void backTrack(int depth, int n, int[] numbers, boolean[] isUsed){
        //深度到达即+1
        if(depth==n){
            result++;
            return;
        }
        //对于1-n每个下标以及其对应的数字
        for(int i=1;i<=n;i++){
            //如果该数字合法且未被使用
            if(isValid(depth+1,numbers[i-1])&&!isUsed[i-1]){
                //将该数字设为已用
                isUsed[i-1]=true;
                //深度增加
                depth++;
                //进行下一回溯
                backTrack(depth,n,numbers,isUsed);
                depth--;
                isUsed[i-1]=false;
            }
        }
    }
    public boolean isValid(int index,int value){
        if(value%index==0||index%value==0){
            return true;
        }
        return false;
    }
}
