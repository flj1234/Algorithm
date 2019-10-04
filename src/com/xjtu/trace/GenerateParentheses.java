package com.xjtu.trace;

import java.util.ArrayList;

/**
 * 已知n组括号，开发一个程序，生成这n组括号所有的合法的组合可能
 * 例如：n = 3
 * 结果为：["((()))", "(()())", "(())()", "()(())", "()()()"]
 * @author flj1234
 *
 */



public class GenerateParentheses {
	public static void generate(String item,int left,int right, ArrayList<String> result){
		if(left == 0 && right == 0){
			result.add(item);
			return ;
		}
		if(left > 0){
			generate(item+'(',left -1,right,result);
		}
		if(left < right){
			generate(item+')',left,right-1,result);
		}
	}
	
	public static void main(String[] args){
		String item = "";
		ArrayList<String> result = new  ArrayList<String>();
		generate(item,2,2,result);
		System.out.println(result);
	}
	
	
}
