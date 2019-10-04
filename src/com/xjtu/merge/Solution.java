package com.xjtu.merge;


class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}


public class Solution {
	public static void main(String[] args) {

	}
	public static ListNode reverse(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode pre = null;
		ListNode pNow = head;
		ListNode pNext= null;
		ListNode tail = null;
		while(pNow != null){
			pNext = pNow.next;
			if(pNext == null) tail = pNow;
			pNow.next = pre;
			pre = pNow;
			pNow = pNext;
		}
		return tail;
	}
}

