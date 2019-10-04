package com.xjtu.trace;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 已知一组数（其中有重复元素），求这组书可以组成的所有子集中，子集中的各个 元素为整数target的子集，结果中无重复的子集 例如：nums[] =
 * [10, 1, 2, 7, 6, 1, 5] target = 8 结果为: [[1, 7], [1, 2, 5], [2, 6], [1, 1, 6]]
 * 
 * @author flj1234
 *
 */


//没有想到更好的方法，就直接在原来的子集的基础上进行剪枝操作，当集合中的元素和大于目标值不再进行回溯
public class CombinationSum {

	static ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();

	public static ArrayList<ArrayList<Integer>> subsets(int[] S, int target) {
		if (S == null || S.length <= 0)
			return listAll;
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(S);

		Findsubset(S, 0, list, 0, target);
		return listAll;
	}

	public static void Findsubset(int[] set, int start, ArrayList<Integer> list, int sum, int target) {
		if(sum == target && !listAll.contains(list)) {
			listAll.add(new ArrayList<>(list));
		}
		for (int i = start; i < set.length; i++) {
			if (i > start && set[i] == set[i - 1] && sum > target)
				continue;
			sum += set[i];
			list.add(set[i]);
			Findsubset(set, i + 1, list, sum, target);
			
			list.remove(list.size() - 1);
			sum -= set[i];
		}
	}

	public static void main(String[] args) {
		int[] num = { 10, 1, 2, 7, 6, 1, 5 };
		ArrayList<ArrayList<Integer>> res = subsets(num, 8);
		System.out.println(res);
	}

}
