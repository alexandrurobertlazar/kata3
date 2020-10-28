package kata3;

import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("HISTOGRAMA");
        this.setContentPane(createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("JFreeChart Histogram", "email domains", "nº emails", 
                dataSet, PlotOrientation.VERTICAL, 
                false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(23, "", "ulpgc.es");
        dataSet.addValue(17, "", "dis.ulpgc.es");
        dataSet.addValue(63, "", "gmail.com");
        dataSet.addValue(32, "", "hotmail.com");
        dataSet.addValue(3, "", "ull.es");
        return dataSet;
    }
    
    public void execute() {
        this.setVisible(true);
    }
}
