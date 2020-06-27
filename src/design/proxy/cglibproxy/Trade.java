package design.proxy.cglibproxy;
/**
 * 服务接口
 * 交易房子（房名，价格）
 * @author HuangYuhan
 *
 */
public interface Trade {
	void buy(String houseName, double money);
}
