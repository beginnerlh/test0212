/*����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
ʾ��:
���� nums = [2, 7, 11, 15], target = 9
��Ϊ nums[0] + nums[1] = 2 + 7 = 9
���Է��� [0, 1]
*/

/*���������ַ���������Ҫ���������ַ������ҳ�����������С���������ж������£�������Ϊĳ�ַ������е�������У��������������ַ����������У���

�����п���ͨ��ɾȥ�ַ����е�ĳЩ�ַ�ʵ�֣������ܸı�ʣ���ַ������˳�򡣿�����Ϊ�����ַ����������У��κ��ַ���Ϊ������������С�

����Ϊ�����ַ����������������еĳ��ȡ���������ڣ��򷵻� -1��

ʾ�� :

����: "aba", "cdc"
���: 3
����: ��������п�Ϊ "aba" (�� "cdc")
˵��:

�����ַ������Ⱦ�С��100��
�ַ����е��ַ������� 'a'~'z'��
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
			System.out.println("�±�Ϊ: "+num[i]);
		}
		*/
		String a = "aba";
		String b = "cbc";
		Solution s = new Solution();
		System.out.println("��������еĳ���Ϊ:"+s.findLUSlength(a, b));
		
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