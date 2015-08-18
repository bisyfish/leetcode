package leetcode.t6;


/**
 * Created by a on 2015/7/27.
 */
public class Solution {
    public String convert(String s, int nRows) {

        if (nRows <= 1)
            return s;

        String result = "";
        int i=0, j=0; //i��ʾ�У�j��ʾs�±꣬k��ʾresult�±�

        int step = 2*(nRows-1);
        for(i=0; i<nRows; i++)
        {
            for(j=i; j<s.length();j+=step)
            {
                result += s.charAt(j);
                if(i==0 || i == nRows-1)
                    continue;

                //������ǵ�һ�л������һ�У�����һ��б���ϵ�����
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