package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
//import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.BarChartModel;

@ManagedBean(name = "DemoBean")
@ViewScoped
public class DemoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	//private CartesianChartModel categoryModel;
	private BarChartModel barModel;

	public DemoBean() {
		createCategoryModel();
	}

	public BarChartModel getCategoryModel() {
		return barModel;
	}

	private void createCategoryModel() {
		barModel = new BarChartModel();
		ChartSeries boys = new ChartSeries();
		boys.setLabel("Boys");
		boys.set("2004", 120);
		boys.set("2005", 100);
		boys.set("2006", 44);
		boys.set("2007", 150);
		boys.set("2008", 25);
		ChartSeries girls = new ChartSeries();
		girls.setLabel("Girls");
		girls.set("2004", 52);
		girls.set("2005", 60);
		girls.set("2006", 110);
		girls.set("2007", 135);
		girls.set("2008", 120);
		barModel.addSeries(boys);
		barModel.addSeries(girls);
	}
}