package com.hyh.algorithm;

import java.util.ArrayList;
/**
 * 	输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author HuangYuhan
 *
 */
public class Sword03 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		//初始化两个容器
		ArrayList<Integer> list = new ArrayList<Integer>();
 		ArrayList<Integer> result = new ArrayList<Integer>();
 		//将输入的链表的结点保存在temp中
 		ListNode temp = listNode;
 		while(temp != null) {
 			list.add(temp.val);
 			temp = temp.next;
 		}
		
 		for(int i=list.size()-1; i>=0; i--) {
 			result.add(list.get(i));
 		}
		return result;
	}
}
