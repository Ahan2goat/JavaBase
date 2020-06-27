package cn.hyh.test;

public class Goat implements Animal {
	//重写
	@Override
	public void eat() {
		System.out.println("吃草");
	}
	//重载
	public void eat(int n) {
	}
	//重写
	@Override
	public void walk() {
		System.out.println("慢慢走");
	}
}
