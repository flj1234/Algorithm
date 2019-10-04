package com.xjtu.sort;

//复杂度为O(n2)
public class 冒泡排序 {
	public static void main(String[] args) {
		int[] num = {1,3,6,1,2,9,8,3,6,5,0};
		int[] res = sort(num);
		for(int i = 0; i < res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
	
	public static int[] sort(int[] num){
		for(int i = 0; i < num.length;i++){
			for(int j = 0; j< num.length-i-1;j++){
				if(num[j] > num[j+1]){
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		return num;
	}
}
