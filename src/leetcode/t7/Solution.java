package leetcode.t7;

/**
 * Created by a on 2015/6/8.
 */
public class Solution {
    public int reverse(int x) {
        long n=0;
        while(x!=0){
            n=n*10+x%10;
            x=x/10;
            if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE) return  0;
        }
        return (int)n;
    }
    public static void main(String[] args){
        System.out.println( new Solution().reverse(2221));
    }

}