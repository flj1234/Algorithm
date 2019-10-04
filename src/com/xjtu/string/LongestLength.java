package com.xjtu.string;

public class LongestLength {
	public static void main(String[] args) {
	
		String str1 = "testabc";
		String str2 = "ttest";
		System.out.println(solve(str1, str2));
		System.out.println(forcesolve(str1, str2));
	}

	private static int forcesolve(String str1, String str2) {
		int maxLen = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)){
					int len = 0;
					while(str1.charAt(i+len) == str2.charAt(j+len)){
						maxLen++;
					}
				}
				maxLen = Math.max(maxLen,maxLen);
			}
		}
		return maxLen;

	}

	private static int solve(String str1, String str2) {
		int max = 0;
		int[][] dp = new int[str1.length()][str2.length()];
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					if (i == 0 || j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i - 1][j - 1] + 1;
					}
					max = Math.max(dp[i][j], max);

				}
			}
		}
		return max;
	}

}
