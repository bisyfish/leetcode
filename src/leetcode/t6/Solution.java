package leetcode.t6;


/**
 * Created by a on 2015/7/27.
 */
public class Solution {
    public String convert(String s, int nRows) {

        if (nRows <= 1)
            return s;

        String result = "";
        int i=0, j=0; //i表示行，j表示s下标，k表示result下标

        int step = 2*(nRows-1);
        for(i=0; i<nRows; i++)
        {
            for(j=i; j<s.length();j+=step)
            {
                result += s.charAt(j);
                if(i==0 || i == nRows-1)
                    continue;

                //如果不是第一行或者最后一行，则还有一个斜线上的数据
                int slash = j + step -2*i;
                if(slash < s.length())
                    result += s.charAt(slash);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("Abcd",3));
    }
}