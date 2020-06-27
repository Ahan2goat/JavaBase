package cn.hyh.test;

public class Tiger implements Animal{
	//重写
	@Override
	public void eat() {
		System.out.println("吃肉");
		
	}
	//重写
	@Override
	public void walk() {
		System.out.println("飞跑");
		
	}

}
