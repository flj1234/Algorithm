package com.xjtu.dfs;

import java.util.ArrayList;

public class IpAddress {
	
	public static void main(String[] args) {
		String s = "25525512234";
		ArrayList<String> res = restoreIpAddresses(s);
		System.out.println(res);
	}
	
    public static ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> ip = new ArrayList<>();  //存放中间结果
        dfs(s, res, ip, 0);
        return res;
    }
     
    private static void dfs(String s, ArrayList<String> res, ArrayList<String> ip, int start){
        if(ip.size() == 4 && start == s.length()){  //找到一个合法解
            res.add(ip.get(0) + '.' + ip.get(1) + '.' + ip.get(2) + '.' + ip.get(3));
            return;
        }
        if(s.length() - start > 3 * (4 - ip.size()))  //剪枝
            return;
        if(s.length() - start < (4 - ip.size()))  //剪枝
            return;
        int num = 0;
        for(int i = start; i < start + 3 && i < s.length(); i++){
            num = num * 10 + (s.charAt(i) - '0');
            if(num < 0 || num > 255)  //剪枝
                continue;
            ip.add(s.substring(start, i + 1));
            dfs(s, res, ip, i + 1);
            ip.remove(ip.size() - 1);
             
            if(num == 0)  //不允许前缀0
                break;
        }
    }
}
