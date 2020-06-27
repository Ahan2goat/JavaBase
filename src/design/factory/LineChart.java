package design.factory;

public class LineChart implements Chart{

	public LineChart() {
		System.out.println("折线图");
	}
	@Override
	public void draw() {
		System.out.println("画折线图");
		
	}

}
