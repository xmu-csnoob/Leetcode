package leetcode.interview.set01;

public class Problem0103 {
    public String replaceSpaces(String S, int length) {
        S=S.substring(0,length);
        return S.replace(" ","%20");
    }
}
