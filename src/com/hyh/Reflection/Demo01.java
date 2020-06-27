package com.hyh.Reflection;

public class Demo01 {
	public static void main(String[] args) {
		String path = "com.hyh.Reflection.pojo.User";
		Integer a = 5;
		try {
			Class clazz = Class.forName(path);
			System.out.println(clazz.hashCode());
			Class clazz2 = Class.forName(path);
			System.out.println(clazz2.hashCode());
			
			Class c1 = String.class;
			System.out.println(c1.hashCode());
			Class c2 = path.getClass();//path的类型是String
			System.out.println(c2.hashCode());
			Class c3 = a.getClass();
			System.out.println(c3.hashCode());
			
			Class ic1 = int.class;
			System.out.println(ic1.hashCode());
			
			int[] arr01 = new int[10];
			int[][] arr02 = new int[30][3];
			int[] arr03 = new int[30];
			double[] arr04 = new double[10];
			
			System.out.println(arr01.getClass().hashCode());
			System.out.println(arr02.getClass().hashCode());
			System.out.println(arr03.getClass().hashCode());
			System.out.println(arr04.getClass().hashCode());
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
