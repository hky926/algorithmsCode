package String.palindromicString;

public class Soluation {
	public static void main(String[] args) {
		System.out.println(longestPalindromeDP("abacdgfdcaba"));
	}

	public static String longestPalindromeDP(String s) {
		char[] str = s.toCharArray();
		int maxLength = 0;
		int len = str.length;
		int maxLen = len - 1;
		boolean[][] map = new boolean[1000][1000];

		for (int i = 0; i < len; i++) {
			map[i][i] = true;
		}

		for (int i = 0; i < len - 1; i++) {
			if (str[i] == str[i + 1]) {
				map[i][i + 1] = true;
				maxLength = i;
				maxLen = 2;
			}
		}
		for (int i = 3; i <= len; i++) {
			for (int j = 0; j < len - i + 1; j++) {
				int k = j + i - 1;
				if (str[j] == str[k] && map[j + 1][k - 1]) {
					map[j][k] = true;
					maxLength = j;
					maxLen = i;
				}
			}
		}
		System.out.println(maxLen + " " + maxLength + " " + len);
		return s.substring(maxLen, maxLength);
	}
}
