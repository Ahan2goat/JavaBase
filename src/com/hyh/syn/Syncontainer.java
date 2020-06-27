package com.hyh.syn;

import java.util.concurrent.CopyOnWriteArrayList;

public class Syncontainer {
	public static void main(String[] args) throws InterruptedException {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		for(int i=0; i<2000; i++) {
			new Thread(()->{
				list.add(Thread.currentThread().getName());
			}).start();
		}
		Thread.sleep(2000);
		System.out.println(list.size());
	}
}
