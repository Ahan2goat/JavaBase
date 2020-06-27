package com.hyh.container;

public class MyHashMap<K,V> {

	Node[] table;
	int size;
	public MyHashMap() {
		table = new Node[16];
	}
	
	public V get(K key) {
		int hash = myHash(key.hashCode(),table.length);
		V value = null;
		
		if(table[hash]!=null) {
			Node temp = table[hash];
			while(temp!=null) {
				if(temp.key.equals(key)) {
					value = (V) temp.value;
					break;
				}else {
					temp = temp.next;
				}
			}
		}
		return value;
	}
	public void put(K key, V value) {
		Node newNode = new Node();
		newNode.hash = myHash(key.hashCode(), table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node temp = table[newNode.hash];
		
		Node iterLast = null;
		boolean keyRepeat = false;
		if(temp==null) {
			table[newNode.hash] = newNode;
			size++;
		}else {
			while(temp!=null) {
				if(temp.key.equals(key)) {
					keyRepeat = true;
					temp.value = value;
					break;
				}else {
					iterLast = temp;
					temp = temp.next;
				}
			}
			if(!keyRepeat) {
				iterLast.next = newNode;
				size++;
			}
		}
	}
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for(int i=0;i<table.length;i++) {
			Node temp = table[i];
			while(temp!=null) {
				sb.append(temp.key+":"+temp.value+",");
				temp = temp.next;
			}
		}
		sb.setCharAt(sb.length()-1, '}');
		return sb.toString();
	}
	public static int myHash(int v,int length) {
		return v&(length-1);
	}
	public static void main(String[] args) {
		MyHashMap<Integer, String> m = new MyHashMap<Integer, String>();
		m.put(10, "aa");
		m.put(20, "bb");
		System.out.println(m.get(95));
	}
}
