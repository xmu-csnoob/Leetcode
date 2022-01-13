package leetcode.medium;

import java.util.*;

public class LeetCode17 {
    public static HashMap<Integer,char[]> hashMap=new LinkedHashMap<Integer,char[]>();
    public List<String> letterCombinations(String digits) {
        List<String> results=new ArrayList<>();
        if(digits.equals("")){
            results.add("");
        }
        hashMap.put(2, new char[]{'a', 'b', 'c'});
        hashMap.put(3,new char[]{'d','e','f'});
        hashMap.put(4,new char[]{'g','h','i'});
        hashMap.put(5,new char[]{'j','k','l'});
        hashMap.put(6,new char[]{'m','n','o'});
        hashMap.put(7,new char[]{'p','q','r','s'});
        hashMap.put(8,new char[]{'t','u','v'});
        hashMap.put(9,new char[]{'w','x','y','z'});
        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i<digits.length();i++){
            numbers.add((int) digits.charAt(i)-48);
        }
        backTrack(0,numbers.size(),numbers,"",results);
        return results;
    }
    public void backTrack(int depth,int n,List<Integer> numbers,String result,List<String> results){
        if(depth==n){
            addResult(result,results);
            return;
        }
        char[] characters=hashMap.get(numbers.get(depth));
        for(int i=0;i<characters.length;i++){
            depth++;
            backTrack(depth,n,numbers, result+String.valueOf(characters[i]),results);
            depth--;
        }
    }
    public void addResult(String result,List<String> results){
        for(String res:results){
            if(res.equals(result)){
                return;
            }
        }
        results.add(result);
    }
}
