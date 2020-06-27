package com.hyh.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test02 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 50; i++) {
			es.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		}
		es.shutdown();
		
	}
}
