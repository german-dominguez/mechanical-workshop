package com.tix.home.dashboard;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class DashboardView extends javax.swing.JPanel {

    /**
     * Creates new form DashboardView
     */
    public DashboardView() {
        initComponents();
        this.barChartPanel.add(createBarChart());
        this.pieChartPanel.add(createPieChart());
    }

    /**
     * Creates new BarChart
     */
    private ChartPanel createBarChart() {
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        chart.setBorderVisible(false);

        // remove the gradient fill
        StandardChartTheme theme = new StandardChartTheme(chart.toString());
        theme.setBarPainter(new StandardBarPainter());
        theme.apply(chart);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setOutlineVisible(false);
        plot.getRenderer().setSeriesPaint(0, new Color(37, 185, 190));
        plot.getRenderer().setSeriesPaint(1, new Color(238, 94, 77));
        plot.getRenderer().setSeriesPaint(2, new Color(109, 185, 95));

        chart.getLegend().setItemLabelPadding(new RectangleInsets(10.0, 5.0, 10.0, 10));

        // hide y axis
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setVisible(false);

        // format the x axis
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setTickLabelPaint(new Color(160, 163, 165));
        domainAxis.setCategoryLabelPositionOffset(4);
        domainAxis.setLowerMargin(0);
        domainAxis.setUpperMargin(0);
        domainAxis.setCategoryMargin(0.2);

        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(10, "USA", "2005");
        dataset.addValue(15, "India", "2005");
        dataset.addValue(20, "China", "2005");

        // Population in 2010  
        dataset.addValue(15, "USA", "2010");
        dataset.addValue(20, "India", "2010");
        dataset.addValue(25, "China", "2010");

        // Population in 2015  
        dataset.addValue(20, "USA", "2015");
        dataset.addValue(25, "India", "2015");
        dataset.addValue(30, "China", "2015");

        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "", //Chart Title  
                "", // Category axis  
                "Population in Million", // Value axis  
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        return chart;

    }

    private ChartPanel createPieChart() {
        JFreeChart chart = createPieChart(createPieDataset());
        chart.setBorderVisible(false);

        StandardChartTheme theme = new StandardChartTheme(chart.toString());

        theme.setPlotBackgroundPaint(Color.white);
        theme.setChartBackgroundPaint(Color.white);
        theme.apply(chart);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setOutlinePaint(null);

        plot.setOutlinePaint(null);
        plot.setLabelShadowPaint(null);
        plot.setLabelBackgroundPaint(null);
        plot.setLabelOutlinePaint(null);
        plot.setLabelLinksVisible(false);
        plot.setLabelPaint(Color.black);
        plot.setShadowYOffset(0);
        plot.setShadowXOffset(0);
        plot.setSectionPaint(createPieDataset().getKey(0), new Color(37, 185, 190));
        plot.setSectionPaint(createPieDataset().getKey(1), new Color(238, 94, 77));
        plot.setSectionPaint(createPieDataset().getKey(2), new Color(109, 185, 95));

        return new ChartPanel(chart);
    }

    private PieDataset createPieDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("IPhone 5s", 20.0);
        dataset.setValue("SamSung Grand", 20.0);
        dataset.setValue("MotoG", 40.0);
        dataset.getKeys();
        return dataset;
    }

    private static JFreeChart createPieChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "", // chart title 
                dataset, // data    
                false, // include legend   
                true,
                false);

        return chart;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barChartPanel = new javax.swing.JPanel();
        pieChartPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barChartPanel.setLayout(new java.awt.BorderLayout());
        add(barChartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 360, 410));

        pieChartPanel.setLayout(new java.awt.BorderLayout());
        add(pieChartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 200));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barChartPanel;
    private javax.swing.JPanel pieChartPanel;
    // End of variables declaration//GEN-END:variables
}
