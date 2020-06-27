package design.factory;

public class HistogramChart implements Chart{

	public HistogramChart(){
		System.out.println("柱状图");
	}
	@Override
	public void draw() {
		System.out.println("画柱状图");
	}

}
