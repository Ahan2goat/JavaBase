package design.proxy.staticproxy;
/**
 * 真实对象
 * @author HuangYuhan
 *
 */
public class Consumer implements Trade{

	@Override
	public void buy(String houseName, double money) {
		System.out.println("我要买房子");
	}
}
