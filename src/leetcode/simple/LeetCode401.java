package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

//回溯+最基本剪枝+遍历去除重复解
public class LeetCode401 {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> results=new ArrayList<>();
        if(turnedOn==0){
            results.add("0:00");
            return results;
        }
        for(int i=0;i<10;i++){
            int[] lightened=new int[10];
            lightened[i]=1;
            backTrack(1,turnedOn,lightened,results);
        }
        return results;
    }
    private void backTrack(int n,int depth,int[] lightened,List<String> results){
        //深度达到即输出
        if(depth==n){
            String result=calTime(lightened);
            for(String res:results){
                if(res.equals(result))
                    return;
            }
            results.add(calTime(lightened));
            return;
        }
        //遍历每个子节点
        for(int i=0;i<10;i++){
            //筛出父节点
            if(lightened[i]==1)
                continue;
            //点亮子节点
            lightened[i]=1;
            //剪枝
            if(!verifyTime(lightened)){
                lightened[i]=0;
                continue;
            }
            //DFS,DFS完成后去掉此子节点,递归深度还原
            n++;
            backTrack(n,depth,lightened,results);
            lightened[i]=0;
            n--;
        }
    }
    private boolean verifyTime(int[] lightened){
        int h=0;
        for(int i=0;i<4;i++){
            h+=lightened[i]*Math.pow(2,i);
        }
        if(h>11){
            return false;
        }
        int m=0;
        for(int i=4;i<10;i++){
            m+=lightened[i]*Math.pow(2,i-4);
        }
        if(m>=60){
            return false;
        }
        return true;
    }
    public String calTime(int[] lightened){
        int h=0;
        for(int i=0;i<4;i++){
            h+=lightened[i]*Math.pow(2,i);
        }
        int m=0;
        for(int i=4;i<10;i++){
            m+=lightened[i]*Math.pow(2,i-4);
        }
        String hour = String.valueOf(h);
        String minute;
        if(m<10){
            minute="0"+m;
        }else{
            minute=String.valueOf(m);
        }
        return hour+":"+minute;
    }
}
