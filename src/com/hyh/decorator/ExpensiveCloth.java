package com.hyh.decorator;

public class ExpensiveCloth extends Clothshop{

	public ExpensiveCloth(Person person) {
		super(person);
	}
	
	@Override
	public void dress() {
		
		super.dress();//调用抽象装饰类服装店的dress-->其实调用的是具体组件
		dressskirt();//调用其他方法，装饰在原有类中
		dresshat();
	}
	public void dressskirt() {
		System.out.println("穿个短裙");
	}
	public void dresshat() {
		System.out.println("戴个帽子");
	}
}
