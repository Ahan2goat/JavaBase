package com.hyh.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.hyh.Reflection.pojo.User;

public class Demo03 {
	public static void main(String[] args) {
		String path = "com.hyh.Reflection.pojo.User";
		
		try {
//			Class cc = Class.forName(path);
//			User user22 = (User) cc.newInstance();
//			System.out.println(user22);
			Class<User> clazz = (Class<User>) Class.forName(path);
			User user = clazz.newInstance();
			System.out.println(user);
			
			Constructor<User> c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
			User user2 = c.newInstance(1,20,"张三");
			System.out.println(user2.getUname());
			
			User user3 = clazz.newInstance();
			Method method = clazz.getDeclaredMethod("setUname", String.class);
			method.invoke(user3, "张三三");
			System.out.println(user3.getUname());
			
			User user4 = clazz.newInstance();
			Field f = clazz.getDeclaredField("uname");
			f.setAccessible(true);
			f.set(user4, "李四");
			System.out.println(user4.getUname());
			System.out.println(f.get(user4));
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
