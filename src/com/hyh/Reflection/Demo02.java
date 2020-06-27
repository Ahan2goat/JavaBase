package com.hyh.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo02 {
	public static void main(String[] args) {
		String path = "com.hyh.Reflection.pojo.User";
		
		try {
			Class clazz = Class.forName(path);
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			
			Field[] fields = clazz.getFields();
			Field[] fields2 = clazz.getDeclaredFields();
			clazz.getDeclaredField("uname");
			for (Field field : fields2) {
				System.out.println(field);
			}
			Method[] methods = clazz.getDeclaredMethods();
			Method methods2 = clazz.getDeclaredMethod("getUname", null);
			Method methods3 = clazz.getDeclaredMethod("setUname", String.class);
			
			for (Method method : methods) {
				System.out.println(method);
			}
			
			Constructor[] constructors = clazz.getDeclaredConstructors();
			Constructor c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
			System.out.println("获得构造器："+c);
			for(Constructor temp:constructors){
				System.out.println("构造器："+temp);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
