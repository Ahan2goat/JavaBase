package com.hyh.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test04 {
	public static void main(String[] args) {
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
		for (int i = 0; i < 50; i++) {
			ses.schedule(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
				}
			}, 2, TimeUnit.SECONDS);
		}
		ses.shutdown();
		
	}
}
