package com.hyh.cooperation;

public class COTest02 {
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		new Player(tv).start();
		new Watcher(tv).start();
	}
}
//生产者演员
	class Player extends Thread{
		Tv tv;
		public Player(Tv tv) {
			this.tv = tv;
		}
		@Override
		public void run() {
			for(int i=0; i<20; i++) {
				if(i%2==0) {
					this.tv.play("奇葩说");
				}else {
					this.tv.play("立白");
				}
			}
		}
		
	}
	//消费者观众
	class Watcher extends Thread{
		Tv tv;
		public Watcher(Tv tv) {
			this.tv = tv;
		}
		@Override
		public void run() {
			for(int i=0;i<20; i++) {
				tv.watch();
			}
		}
	}
	//同一个资源电视
	class Tv{
		String voice;
		//信号灯
		//T 表示演员表演，观众等待
		//F 表示观众观看，演员等待
		boolean flag = true;
		//表演
		public synchronized void play(String voice) {
			//演员等待
			if(!flag) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//表演
			System.out.println("表演了"+voice);
			this.voice = voice;
			//唤醒
			this.notifyAll();
			//切换信号灯
			this.flag = !this.flag;
		}
		//观看
		public synchronized void watch() {
			//观众等待
			if(flag) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//观看
			System.out.println("听到了"+voice);
			//唤醒
			this.notifyAll();
			//切换信号灯
			this.flag = !this.flag;
		}
	}
