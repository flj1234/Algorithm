package com.xjtu.sort;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

/*
表现最稳定的排序算法之一，因为无论什么数据进去都是O(n2)的时间复杂度，所以用到它的时候，数据规模越小越好。
 唯一的好处可能就是不占用额外的内存空间了吧。理论上讲，选择排序可能也是平时排序一般人想到的最多的排序方法了吧。
选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：首先在未排序序列中找到最小（大）元素，存放
到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，
直到所有元素均排序完毕。
最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
 */
public class 快速排序 {
	public static void quickSort(int[] num, int low, int high) {
		int i, j, temp, t;
		if (low > high) {
			return;
		}
		i = low;
		j = high;
		temp = num[low];// temp就是基准位
		while (i < j) {
			while (num[j] >= temp && i < j)
				j--; // 先看右边，依次往左递减
			while (num[i] <= temp && i < j)
				i++; // 再看左边，依次往右递增
			if (i < j) { // 如果满足条件则交换
				t = num[j];
				num[j] = num[i];
				num[i] = t;
			}

		}
		num[low] = num[j]; // 最后将基准为与i和j相等位置的数字交换
		num[j] = temp;
//		System.out.print("*****");
//		for (int k = 0; k < arr.length; k++) {
//			System.out.print(arr[k] + " ");
//		}
//		System.out.println();
		quickSort(num, low, j - 1);// 递归调用左半数组
		quickSort(num, j + 1, high);// 递归调用右半数组
	}

	public static void main(String[] args) {
		int[] num = { 10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19 };
		quickSort(num, 0, num.length - 1);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
