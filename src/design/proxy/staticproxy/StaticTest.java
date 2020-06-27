package design.proxy.staticproxy;

public class StaticTest {
	public static void main(String[] args) {
		//new一个真实对象
		Consumer consumer = new Consumer();
		//new一个代理对象,将真实对象传给他
		Agent agent = new Agent(consumer);
		agent.buy("白云小区", 100);
	}
}