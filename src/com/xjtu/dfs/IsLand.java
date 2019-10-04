package com.xjtu.dfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 用一个二维数组代表一张地图， 这张地图由字符“0”与字符“1”组
 * 成， 其中“0”字符代表水域， “1”字符代表小岛土地， 小岛“1”被
 * 水“0”所包围， 当小岛土地“1”在水平和垂直方向相连接时， 认
 *  为是同一块土地。 求这张地图中小岛的数量。
 * @author flj1234
 *
 */


//leetcode 200. number of island
public class IsLand {
	
	public static void main(String[] args) {
		int[][] grid = {{1,1,0,0,1},
						{1,0,0,1,0},
						{0,0,1,0,1},
						{1,0,0,1,1}};
		System.out.println(numIslands(grid));
	}
	
	
	//深度搜索
	//1.标记当前搜索位置已被搜索(标记当前位置的mark数组为1)。
	//2.按照方向数组的4个方向， 拓展4个新位置newx、 newy。
	//3.若新位置不在地图范围内， 则忽略。
	//4.如果新位置未曾到达过(mark[newx][newy]为0)、 且是陆地
	//(grid[newx][newy]为"1")， 继续DFS该位置。
	public static void dfs(int[][] mark,int[][] grid,int x, int y){
		mark[x][y]  = 1;
		int[] dx = {-1,1,0,0};  //方向数组
		int[] dy = {0,0,-1,1};
		for(int i = 0; i < 4; i++){
			int newx = dx[i] + x;
			int newy = dy[i] + y;
			if(newx < 0 || newx >= mark.length ||
			   newy < 0 || newy >= mark[0].length){  //检查是否越界
				continue;
			}
			if(mark[newx][newy] == 0&& grid[newx][newy] == 1){  //什么情况下深搜
				dfs(mark,grid,newx,newy);
			}
		}
	}	
//	求地图中岛屿的数量:
//	1.设置岛屿数量island_num = 0；
//	2.设置mark数组， 并初始化。
//	3.遍历地图grid的上所有的点， 如果当前点是陆地， 且未被访问过， 调用搜索接口
//	search(mark, grid, i, j);search可以是DFS或BFS； 完成搜索后island_num++。
	public static int numIslands(int[][] grid){
		int num = 0;
		int[][] mark = new int[grid.length][grid[0].length];
		for(int i = 0; i < grid.length;i++){
			for(int j = 0; j < grid[0].length;j++){
				if(mark[i][j] == 0 && grid[i][j] == 1){
					dfs(mark,grid,i,j);
					num++;
				}
			}
		}
		return num;
	}
	
}
