package design.factory;

/**
 * @author HuangYuhan
 *
 */
public class PieChart implements Chart{
	
	
	public PieChart(){
		System.out.println("饼状图");
	}
	
	@Override
	public void draw() {
		System.out.println("画饼状图");
	}

}
