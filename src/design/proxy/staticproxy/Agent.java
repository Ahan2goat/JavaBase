package design.proxy.staticproxy;
import design.proxy.staticproxy.Consumer;;

/**
 * 由中介代理买房子
 * 引入消费者引用
 * 调用消费者买房子方法
 * 在他前后动手脚
 * @author HuangYuhan
 *
 */
public class Agent implements Trade{
	Consumer Consumer = new Consumer();
	
	public Agent(Consumer consumer) {
		super();
		Consumer = consumer;
	}

	@Override
	public void buy(String houseName, double money) {
		System.out.println("中介找房子");
		Consumer.buy(houseName, money);
		System.out.println("中介收钱");
	}

}
