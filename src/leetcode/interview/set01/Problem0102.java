package leetcode.interview.set01;

public class Problem0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        for(int i=0;i<s1.length();i++)
        {
            if(countChar(s1.charAt(i),s1)!=countChar(s1.charAt(i),s2))
                return false;
        }
        return true;
    }
    public int countChar(char c,String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}
