package leetcode.interview.set01;

public class Problem0101 {
    public boolean isUnique(String astr) {
        for(int i=0;i<astr.length()-1;i++)
        {
            for(int j=i+1;j<astr.length();j++)
            {
                if(astr.charAt(j)==astr.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
