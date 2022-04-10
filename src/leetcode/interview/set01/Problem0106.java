package leetcode.interview.set01;

public class Problem0106 {
    public String compressString(String S) {
        String res="";
        int index=0;
        while(index<S.length())
        {
            int count=1;
            char c=S.charAt(index);
            res+=String.valueOf(c);
            index++;
            while(index<S.length()&&S.charAt(index)==c)
            {
                count++;
                index++;
            }
            res+=String.valueOf(count);
        }
        if(res.length()<S.length())
            return res;
        else
            return S;
    }
}
