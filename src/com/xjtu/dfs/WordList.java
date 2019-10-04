package com.xjtu.dfs;

/**
 * 已知两个单词(分别是起始单词与结束单词)， 一个单词词典， 根据转换规则计算
 * 从起 始单词到结束单词的最短转换步数。 转换规则如下: 
 * 1.在转换时，只能转换单词中的1个字符。
 * 2.转换得到的新单词， 必须在单词词典中。 
 * 例如: beginWord = “hit”； endWord = “cog”；
 * wordList = ["hot","dot","dog","lot","log","cog"] 
 * 最短转换方式: "hit" -> "hot" ->"dot" -> "dog" -> "cog", 结果为5。
 * 
 * @author flj1234
 *
 */

// leetcode 127 word ladder

public class WordList {
//	单词与单词之间的转换， 可以理解为一张图， 图的顶点为单词， 若两单词之间可以互相
//	转换， 则这两个单词所代表的顶点间有一条边， 求图中节点hit(beginWord)到节点
//	cog(endWord)的所有路径中， 最少包括多少个节点。 即图的宽度优先搜索。
}
