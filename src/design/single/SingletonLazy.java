package design.single;

public class SingletonLazy {
	private SingletonLazy() {}
	private SingletonLazy singletonLazy = null;
	
	public SingletonLazy getInstance() {
		if(singletonLazy == null) {
			synchronized (SingletonLazy.class) {
				if(singletonLazy == null) {
					singletonLazy = new SingletonLazy();
				}
			}
		}
		return singletonLazy;
	}
}
