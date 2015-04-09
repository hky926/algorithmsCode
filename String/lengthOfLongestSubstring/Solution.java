package algorithmsCode.String.lengthOfLongestSubstring;

/**
 * Created by huai on 15/4/7.
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class Solution {
	public static void main(String[] args) {
		char[] t = new char[2];

	}
	public static int lengthOfLongestSubstring(String s) {
		char[] token = new char[1024];
		int count = 0;
		for(int i = 0;i < s.length(); i++)
		{
			for(int j = 0;j < token.length;i++)
			{
				if (token[j] == (char)15)
					break;
				if (token[j] == s.charAt(i + 1))
				{
					if (token[j] == (char)15)
					{
						count ++;
					}
				}else{

				}

			}
		}
		return 0;
	}
}
