package com.hyh.decorator;

public class Client {
	public static void main(String[] args) {
		Person person = new Girl();
		Clothshop expensiveCloth = new ExpensiveCloth(person);
		expensiveCloth.dress();
	}
}
