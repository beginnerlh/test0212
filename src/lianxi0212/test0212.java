/*给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
*/

/*给定两个字符串，你需要从这两个字符串中找出最长的特殊序列。最长特殊序列定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。

子序列可以通过删去字符串中的某些字符实现，但不能改变剩余字符的相对顺序。空序列为所有字符串的子序列，任何字符串为其自身的子序列。

输入为两个字符串，输出最长特殊序列的长度。如果不存在，则返回 -1。

示例 :

输入: "aba", "cdc"
输出: 3
解析: 最长特殊序列可为 "aba" (或 "cdc")
说明:

两个字符串长度均小于100。
字符串中的字符仅含有 'a'~'z'。
*/
package lianxi0212;

public class test0212 {
	public static void main(String[] args) {
	/*	int[] nums = new int[] { 2, 7, 11, 15};
		int target = 9;
		Solution s = new Solution();
		int num[] = s.twoSum(nums, target);
		for(int i=0;i<num.length;i++)
		{
			System.out.println("下标为: "+num[i]);
		}
		*/
		String a = "aba";
		String b = "cbc";
		Solution s = new Solution();
		System.out.println("最长特殊序列的长度为:"+s.findLUSlength(a, b));
		
	}
}
/*
class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        for (int i = 0;i < nums.length; i++)
        {
            for (int j = i+1 ;j < nums.length; j++)
            {
                if(nums[i] == target-nums[j])
                {
                    return new int[] {i,j};
                }
            }
        }
    throw new IllegalArgumentException("No two sum solution");
}
}
*/
class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))
        {
            return -1;
        }
        else
        {
            return a.length()>b.length() ? a.length() :b.length();
        }
    }
}