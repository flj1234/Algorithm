package com.xjtu.sort;


//复杂度为O(n2)
public class 选择排序 {
	public static void main(String[] args) {
		int[] num = {1,3,6,1,2,9,8,3,6,5,0};
		int[] res = sort(num);
		for(int i = 0; i < res.length;i++){
			System.out.print(res[i]+" ");
		}
	}

	private static int[] sort(int[] num) {
		for(int i = 0 ; i < num.length;i++){
			for(int j = i+1; j < num.length;j++){
				if(num[i] > num[j]){
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num;
	}
}
