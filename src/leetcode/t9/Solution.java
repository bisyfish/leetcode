package leetcode.t9;

/**
 * Created by a on 2015/7/16.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return  false;
        }
       String  s =String.valueOf(x);
        char[] chars=new char[s.length()];
        for(int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        for(int i=0;i<=s.length()/2;i++){
            if(chars[i]!=chars[s.length()-1-i]){
                return  false;
            }
        }
        return  true;
    }
}
