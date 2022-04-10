package leetcode.interview.set01;

public class Problem0105 {
    public boolean oneEditAway(String first, String second) {
        if(first.equals(second))
            return true;
        int sub=first.length()-second.length();
        if(Math.abs(sub)!=1&&sub!=0)
            return false;
        if(first.length()==second.length()){
            int diffNum=0;
            for(int i=0;i<first.length();i++)
            {
                if(first.charAt(i)!=second.charAt(i))
                    diffNum++;
            }
            if(diffNum>1){
                return false;
            }
        }else{

        }
        return true;
    }
    public boolean contains(char c,String str){
        for(int i=0;i<str.length();i++)
        {
            if(c==str.charAt(i))
                return true;
        }
        return false;
    }
}

