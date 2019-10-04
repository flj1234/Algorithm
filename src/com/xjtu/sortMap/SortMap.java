package com.xjtu.sortMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("图书", 4);
		map.put("音像", 6);
		map.put("素材", 9);
		map.put("音乐", 8);
		map.put("影视", 7);
		map.put("动漫", 4);
		map.put("歌曲", 3);
		map.put("图片", 2);
		map.put("图标", 6);
		ArrayList<Entry<String, Integer>> entries = sortMap(map);
		for (int i = 0; i < entries.size(); i++) {
			System.out.println(entries.get(i).getKey() + ":" + entries.get(i).getValue());
		}
	}

	public static ArrayList<Entry<String, Integer>> sortMap(Map map) {
		ArrayList<Entry<String, Integer>> entries = new ArrayList<Entry<String, Integer>>(map.entrySet());
		System.out.println(entries);
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				return obj2.getValue() - obj1.getValue();
			}
		});
		return entries;
	}
}
