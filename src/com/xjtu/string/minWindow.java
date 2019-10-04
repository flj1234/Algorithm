package com.xjtu.string;



public class minWindow {
	public static void main(String[] args) {
		String str1 = "ADOBECODEBANC";
		String str2 = "ABC";
		System.out.println(minWindow(str1, str2));
	}
    public static String minWindow(String S, String T) {
        int[] map = new int[128];
        for(int i = 0; i < T.length(); i++) {
            map[T.charAt(i)]++;
        }

        int begin = 0, end = 0, d = Integer.MAX_VALUE, counter = T.length(), head = 0;
        while(end < S.length()) {     
            int[] num = map.clone();
            if(num[S.charAt(end++)]-- > 0) {
                counter--;
            }      
            if (counter == 0) {
                if(end - begin < d) {
                    d = end - begin;
                    head = begin;
                }
                counter = T.length();
            }
            
        }
        return d==Integer.MAX_VALUE ? "" :S.substring(head, head+d);
    }
}
