package design.single;

public class SingletonHungry {
	private SingletonHungry() {}
	private SingletonHungry singletonHungry = new SingletonHungry();
	public SingletonHungry getInstance() {
		return singletonHungry;
	}
}
