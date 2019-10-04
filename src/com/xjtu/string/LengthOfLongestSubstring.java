package com.xjtu.string;

import java.util.HashMap;

public class LengthOfLongestSubstring {
	
	public static void main(String[] args) {
		String s = "eeabcdabcd";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        //新建一个map进行存储char
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int leftBound = 0;
        int max = 0;
        for(int i=0; i<s.length();i++){
            char  c = s.charAt(i);
            //窗口左边可能为下一个char，或者不变
            leftBound = Math.max(leftBound,(map.containsKey(c))? map.get(c)+1:0);
            max = Math.max(max, i-leftBound+1);//当前窗口长度
            map.put(c,i);
        }
        return max;
         
    }
}
