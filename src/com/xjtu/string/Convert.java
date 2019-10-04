package com.xjtu.string;

public class Convert {

	public static void main(String[] args) {
		String str = "PAYPALISHIRING";
		System.out.println(convert(str, 3));
	}

	public static String convert(String s, int nRows) {
		if (s == null || s.length() == 0 || nRows <= 1)
			return s;

		StringBuffer[] sb = new StringBuffer[nRows];
		for (int i = 0; i < sb.length; i++)
			sb[i] = new StringBuffer();

		int len = s.length();
		int i = 0;
		while (i < len) {
			for (int j = 0; j < nRows && i < len; j++)
				sb[j].append(s.charAt(i++));
			for (int j = nRows - 2; j > 0 && i < len; j--)
				sb[j].append(s.charAt(i++));
		}

		for (int j = 1; j < nRows; j++)
			sb[0].append(sb[j]);

		return sb[0].toString();
	}
}
