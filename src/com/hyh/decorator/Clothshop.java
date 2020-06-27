package com.hyh.decorator;

public abstract class Clothshop extends Person{
	
	private Person person;//持有抽象组件的引用，方便调用具体组件（多态）的方法

	public Clothshop(Person person) {
		super();
		this.person = person;
	}
	
	@Override
	public void dress() {
		person.dress();
	}
}
