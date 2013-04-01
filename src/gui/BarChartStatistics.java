package gui;

import java.awt.Color;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChartStatistics{
	
	public BarChartStatistics(int[][] numbers){
		
		DefaultCategoryDataset dataChart = new DefaultCategoryDataset();
		
		int[] freq = new int[81];
		
		//Frequency
		for(int i = 0;i<numbers.length;i++){
			for(int j = 0;j<numbers[0].length;j++){
				freq[numbers[i][j]]++;
			}
		}
		
		//Set Values
		for(int i = 1;i<=80;i++){
			dataChart.setValue(freq[i], "Numbers", String.format("%d", i));
		}
		
		//Create Chart
		JFreeChart chart = ChartFactory.createBarChart("Frequency Density","Numbers", "frequency", dataChart, PlotOrientation.VERTICAL, false,true, false);
		chart.setBackgroundPaint(Color.gray);
		chart.getTitle().setPaint(Color.black);
		CategoryPlot plot = chart.getCategoryPlot();
		plot.setRangeGridlinePaint(Color.red);
		ChartFrame frame = new ChartFrame("Bar Chart",chart);
		frame.setVisible(true);
		frame.setSize(1000,500);
	}
}
