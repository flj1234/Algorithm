package com.xjtu.sort;

/*
 * 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，
 * 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上，
 * 通常采用in-place排序（即只需用到O(1)的额外空间的排序），因而在从后向前扫描过程中，
 * 需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 */
public class 插入排序 {
	public static void main(String[] args) {
		int[] num = {1,3,6,1,2,9,8,3,6,5,0};
		int[] res = sort(num);
		for(int i = 0; i < res.length;i++){
			System.out.print(res[i]+" ");
		}
	}

	private static int[] sort(int[] num) {
		for(int i = 0; i < num.length-1;i++){
			int current = num[i+1];
			int index = i;
			while( index >= 0 && num[index] > current){
				num[index +1] = num[index];
				index--;
			}
			num[index+1] = current;
		}
		return num;
	}
}
