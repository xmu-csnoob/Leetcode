package leetcode.interview.set01;

import java.util.ArrayList;
import java.util.List;

public class Problem0104 {
    public boolean canPermutePalindrome(String s) {
        int oddNum=0;
        List<Character> hasCal=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!hasCal.contains(s.charAt(i))) {
                int count = countChar(s.charAt(i), s);
                hasCal.add(s.charAt(i));
                if (count % 2 != 0)
                    oddNum++;
            }
        }
        return oddNum <= 1;
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
