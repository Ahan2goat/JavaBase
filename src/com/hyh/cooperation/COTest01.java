package com.hyh.cooperation;

public class COTest01 {
	public static void main(String[] args) {
		SynContainer container = new SynContainer();
		new Productor(container).start();
		new Consumer(container).start();
	}
}
//生产者
class Productor extends Thread{
	SynContainer container;

	public Productor(SynContainer container) {
		this.container = container;
	}
	@Override
	public void run() {
		//生产
		for(int i=0; i<100; i++) {
			System.out.println("生产了"+i+"个馒头");
			container.push(new Steamedbun(i));
		}
	}
}
//消费者
class Consumer extends Thread{
	SynContainer container;

	public Consumer(SynContainer container) {
		super();
		this.container = container;
	}
	@Override
	public void run() {
		//消费
		for(int i=0; i<100;i++) {
			System.out.println("消费"+container.pop().id+"个馒头");
		}
	}
}
//缓冲区
class SynContainer{
	Steamedbun[] buns = new Steamedbun[10];
	int count = 0;//计数器
	//存储生产
	public synchronized void push(Steamedbun bun) {
		//何时能生产  容器存在空间
		//不能生产 只有等待
		if(count==buns.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//存在空间，可以生产
		buns[count] = bun;
		count++;
		//存在数据了，通知可以消费了
		this.notifyAll();
		
	}
	//消费
	public synchronized Steamedbun pop() {
		//何时消费 容器中是否存在数据
		//没有馒头吃不了，只能等待
		if(count==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//存在馒头可以吃
		count--;
		Steamedbun steamedbun = buns[count];
		this.notifyAll();
		return steamedbun;
	}
	
}
//产品
class Steamedbun{
	int id;

	public Steamedbun(int id) {
		this.id = id;
	}
}
