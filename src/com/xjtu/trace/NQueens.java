package com.xjtu.trace;

import java.util.ArrayList;

public class NQueens {

	public static void PutQueens(int x, int y, int[][] mark) {
		int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1 };
		int[] dy = { 0, 0, -1, 1, -1, 1, -1, 1 };
		mark[x][y] = 1;
		for (int i = 1; i < mark.length; i++) {
			for (int j = 0; j < 8; j++) {
				int new_x = x + i * dx[j];
				int new_y = y + i * dy[j];
				if (new_x >= 0 && new_x < mark.length && new_y >= 0 && new_y < mark.length) {
					mark[new_x][new_y] = 1;
				}
			}
		}
	}

	private static void generate(int k, int n, char[][] location, char[][] result, int[][] mark) {
		if (k == n) {
			result = location;
			return;
		}
		for (int i = 0; i < n; i++) {
			if (mark[k][i] == 0) {
				int[][] temp_mark = mark;
				location[k][i] = 'Q';
				PutQueens(k, i, mark);
				generate(k + 1, n, location, result, mark);
				mark = temp_mark;
				location[k][i] = '.';
			}
		}
	}
	
	public static char[][] solveNQueens(int n){
		char[][] result = new char[n][n];
		int[][] mark = new int[n][n];
		char[][] location = new char[n][n];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mark[i][j] = 0;
				location[i][j] = '.';
			}
		}
		generate(0, n, location, result, mark);
		return result;
	}
	
	public static void main(String[] args) {
		char[][] result = new char[4][4];
		result = solveNQueens(5);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(result[i][j]);
			}
			System.out.print("\n");
		}
	}

}
