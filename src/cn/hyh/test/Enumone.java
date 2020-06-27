package cn.hyh.test;
/**
 * 枚举类型
 * @author HuangYuhan
 *
 */
enum AccountType {
	SAVING,FIXED,CURRENT;
	private AccountType() {//只能是private
		System.out.println("it is a accounttypt");
	}
}
class Enumone{
	public static void main(String[] args) {
		System.out.println(AccountType.FIXED);
	}
}
