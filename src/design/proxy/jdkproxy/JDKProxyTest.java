package design.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxyTest {
	public static void main(String[] args) {
		//new一个真是对象
		Trade consumer = new Consumer();
		//new一个代理对象
		InvocationHandler agent = new Agent(consumer);
		
		Trade agent007 = (Trade) Proxy.newProxyInstance(agent.getClass().getClassLoader(), consumer.getClass().getInterfaces(), agent);
		agent007.buy("珠江新城", 1000);
	}
}
