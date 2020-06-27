package com.hyh.threadcommunication;

public class Test {
	public static void main(String[] args) {
		User user = new User();
		System.out.println(user.hashCode());
		System.out.println(user.equals(user));
	}
}
