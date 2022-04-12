package leetcode.towardOffer;

public class Problem10 {
    public int numWays(int n) {
        long [] methods=new long[n+1];
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        methods[0]=1;
        methods[1]=1;
        methods[2]=2;
        for(int i=3;i<methods.length;i++){
            methods[i]=((methods[i-1]%1000000007)+(methods[i-2]%1000000007))%1000000007;
        }
        return (int) methods[n];
    }
}
