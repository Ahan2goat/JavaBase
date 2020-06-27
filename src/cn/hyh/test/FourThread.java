package cn.hyh.test;

public class FourThread {
	private int j;
	public static void main(String[] args) {
		FourThread f = new FourThread();
		Inc inc = f.new Inc();
		Desc desc = f.new Desc();
		for(int i = 0; i<2; i++) {
			Thread thread = new Thread(inc);
			thread.start();
			thread = new Thread(desc);
			thread.start();
		}
	}
	
	private synchronized void inc() {
		j++;
	}
	private synchronized void desc() {
		j--;
	}
	class Inc implements Runnable{
		@Override
		public void run() {
			for(int i = 0; i<20; i++) {
				inc();
			}
		}
	}
	class Desc implements Runnable{

		@Override
		public void run() {
			for(int i = 0; i<20; i++) {
				desc();
			}
		}
		
	}
}
