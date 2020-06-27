package cn.hyh.test;

import java.util.Scanner;
import java.util.Stack;

public class MyLinkedList {
	public static class Node{
		public int value;
		public Node next;
		
		
		public Node() {
			super();
		}
		public Node(int value){
			this.value = value;
		}
	}
	
	
	public static Node rmvalue(Node head, int num) {
		Stack<Node> stack = new Stack<Node>();
		while(head!=null) {
			if(head.value!=num) {
				stack.push(head);
			}
			head = stack.pop();
		}
		return head;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = new Node();
		int num = sc.nextInt();
		String list = sc.nextLine();
		MyLinkedList.rmvalue(head, num);
	}
	
}













