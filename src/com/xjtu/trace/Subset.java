package com.xjtu.trace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
public class Subset {
	static ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
 
    public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
        if (S == null || S.length <= 0)
            return listAll;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(S);
 
        Findsubset(S, 0, list);
        return listAll;
    }
 
    public static void Findsubset(int[] set, int start, ArrayList<Integer> list) {
        listAll.add(new ArrayList<>(list));
 
        for (int i = start; i < set.length; i++) {
            if (i > start && set[i] == set[i - 1])
                continue;
            list.add(set[i]);
            Findsubset(set, i + 1, list);
            
            list.remove(list.size() - 1);
        }
    }
    
    
    public static void main(String[] args) {
		int[] num = {1,2,2,2,3,3,3};
		ArrayList<ArrayList<Integer>> res =  subsets(num);
		System.out.println(res);
	}
}