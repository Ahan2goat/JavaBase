package design.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类中介实现
 * @author HuangYuhan
 *
 */
public class Agent implements InvocationHandler{

	Trade consumer;
	
	public Agent(Trade consumer2) {
		this.consumer = consumer2;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//前
		//中介找房子
		System.out.println("中介找房子");
		System.out.println("method"+method);
		
		//consumer为真实对象
		//当代理对象调用真实对象的方法时，自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
		Object obj = method.invoke(consumer, args);
		
		//后
		//中介收取中介费
		System.out.println("中介收取中介费");
		return obj;
	}

}
