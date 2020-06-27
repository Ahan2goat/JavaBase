package design.factory;

public class ChartFactory {
	public static Chart getChart(String type) {
		Chart chart = null;
		if("HistogramChart".equals(type)) {
			chart = new HistogramChart();
		}else if("LineChart".equals(type)){
			chart = new LineChart();
		}else if("pieChart".equals(type)) {
			chart = new PieChart();
		}
		return chart;
	}
}
