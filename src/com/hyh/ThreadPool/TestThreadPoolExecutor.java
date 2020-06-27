package com.hyh.ThreadPool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPoolExecutor {
	public static void main(String[] args) {
		ThreadPoolExecutor tpe = new ThreadPoolExecutor(1, 2, 3, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(3));
		tpe.execute(new newMyThread());
		tpe.execute(new newMyThread());
		tpe.execute(new newMyThread());
		tpe.execute(new newMyThread());
		tpe.execute(new newMyThread());
		tpe.shutdown();
	}
}
class newMyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}